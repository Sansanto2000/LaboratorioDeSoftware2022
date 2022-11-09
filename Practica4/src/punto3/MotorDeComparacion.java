package punto3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class MotorDeComparacion {
	
	public HashSet<String> comparar(DiccionarioDe2Gramas dic, String cadena) {
		ArrayList<String> gramas = generarGramasTamaño2(cadena);
		HashSet<String> plabras_macheadas = dic.machearTodos(gramas);
		HashSet<String> palabras_que_cumplen_LD = new HashSet<String>();
		for(String plabra: plabras_macheadas) {
			int lD = LevenshteinDistance.computeLevenshteinDistance(plabra, cadena);
			if (lD < 3) { // Aca podria interpretar que se pide "<=" , pero creo que el enunciado indica "<" asi que lo respetare
				palabras_que_cumplen_LD.add(plabra);
			}
		}
		return palabras_que_cumplen_LD;
		
	}
	
	private ArrayList<String> generarGramasTamaño2(String cadena) {
		ArrayList<String> gramas = new ArrayList<String>();
		String aux = "#"+cadena+"$";
		for(int i=0;i<(aux.length())-1;i++) {
			String grama = ""+aux.charAt(i)+""+aux.charAt(i+1)+""; 
			gramas.add(grama);
		}
		return gramas;
	}
}
