package lecturaArchivoCondicional;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        ReaderFile readerFile = new ReaderFile(Paths.get("palabras.txt"));

        // Lineas de mayor longitud que 3 que contienen la letra 'a' en mayusculas
        List<String> resultado = readerFile.read(
                linea -> linea.length() > 3 && linea.contains("z"),
                String::toUpperCase
        );

        System.out.println(resultado);
    }
}
