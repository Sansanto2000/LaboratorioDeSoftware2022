package punto3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class DiccionarioDe2Gramas {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<String> palabras;
	
	public DiccionarioDe2Gramas(ArrayList<String> palabras) {
		this.palabras = palabras;
	}

	public HashSet<String> machear(String key) {
		if(key.length() != 2) { 
			System.out.println("la key "+key+" no contiene exactamente 2 caracteres, por lo que no se ejecutara la funcion put en el diccionario "+this);
			return null;
		}
		HashSet<String> palabras_aux = new HashSet<String>();
		for(String palabra: this.palabras ) {
			String aux = "#"+palabra+"$";
			if(aux.contains(key)) {
				palabras_aux.add(palabra);
			}
		}
		return palabras_aux;
    }
	
	public HashSet<String> machearTodos(ArrayList<String> keys) {
		HashSet<String> palabras_total = new HashSet<String>();
		for(String key: keys) {
			palabras_total.addAll(this.machear(key));
		}
		return palabras_total;
    }
}
