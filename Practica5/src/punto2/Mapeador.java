package punto2;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;

public class Mapeador {
	
	private Mapeador() {
		
	}
	
	public static void mapear(String nombreArchivo, Class <?> xClass) {
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("./src/punto2/"+nombreArchivo,true);
            pw = new PrintWriter(fichero);
            
            pw.println("<nombreClase>"+xClass.getSimpleName()+"</nombreClase>");
            	
            for (Field field : xClass.getDeclaredFields()) {
            	if(field.isAnnotationPresent(AlmacenarAtributo.class)) {
            		pw.println("<nombreAtributo>"+field.getName()+"</nombreAtributo>");
            		
            		Object valorVariable = null;
            		try {
            			field.setAccessible(true);
            			// La unica forma de que los valores se recuperen fue creando una instancia de xClass
            			// de otra forma siempre se levanta un error. 
            			valorVariable = field.get(xClass.getDeclaredConstructor().newInstance()); 
            		} catch (IllegalArgumentException | IllegalAccessException e) {
            			e.printStackTrace();
            		}
            		pw.println("<nombreValor>"+valorVariable+"</nombreValor>");
            	}
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}
}
