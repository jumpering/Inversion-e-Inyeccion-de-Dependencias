package lecturaArchivoCondicional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReaderFile {

    private final Path inputPath;

    public ReaderFile(Path inputPath) {
        this.inputPath = inputPath;
    }

    public <T> List<T> read(
            Predicate<String> predicate,
            Function<String, T> mapper) throws IOException {

        return Files.readAllLines(inputPath)
                .stream()
                .filter(predicate)
                .map(mapper)
                .collect(Collectors.toList());
    }
}
