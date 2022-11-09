package punto3;

import java.util.ArrayList;
import java.util.HashSet;

public class TestDiccionarioDe2Gramas {
	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<String>();
		palabras.add("casa");
		palabras.add("campo");
		palabras.add("caso");
		palabras.add("calle");
		palabras.add("cayo");
		palabras.add("colo");
		palabras.add("callo");
		palabras.add("hola");
		palabras.add("glucosa");
		palabras.add("triptosa");
		palabras.add("sacarosa");
		palabras.add("silicona");
		palabras.add("hierro");
		palabras.add("revelde");
		palabras.add("comida");
		palabras.add("impertinente");
		palabras.add("competente");
		palabras.add("lucas");
		palabras.add("santiago");
		palabras.add("osmosis");
		
		DiccionarioDe2Gramas dic = new DiccionarioDe2Gramas(palabras);
		MotorDeComparacion mot = new MotorDeComparacion();
		
		String palabra = "calle";
		HashSet<String> resultado = (HashSet<String>) mot.comparar(dic, palabra);
		
		
		System.out.println("Resultado = "+resultado);
		
		
		
	}
}
