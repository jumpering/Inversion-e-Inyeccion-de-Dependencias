package lecturaArchivoCondicional;

public class Main {
	public static void main(String[] args) {
		Filter filtro = new FiltroVocales();
		ReaderFile readerFile = new ReaderFile(filtro);
		
	}
}
