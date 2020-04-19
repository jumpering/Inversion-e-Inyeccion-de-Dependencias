package lecturaArchivoCondicional;

import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderFile {

	public ReaderFile(Filter filtro) {
		try {
			File file = new File("palabras.txt");
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			String linea;
			while ((linea = bf.readLine()) != null) {
				if (linea.equals(filtro) || linea.length() == filtro) {
					// System.out.println("control dentro del IF");
					System.out.println(linea);
				}
			}
			fr.close();
		} catch (FileNotFoundException ex) {
			ex.getMessage();
		} catch (IOException ex) {
			ex.getMessage();
		}
	}

}
