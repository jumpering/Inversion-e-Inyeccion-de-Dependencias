package lecturaArchivoCondicional;

public class FiltroLongitud implements Filtro<Integer> {

	@Override
	public Integer apply(String s) {
		return s.length();
	}
}
