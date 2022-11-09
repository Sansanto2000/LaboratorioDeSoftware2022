package punto2;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Class <?> mapClass = Class.forName("punto2.Mapeado");
		
		if(mapClass.isAnnotationPresent(Archivo.class)) {
			String nombreArchivo = mapClass.getAnnotation(Archivo.class).nombre();
			
			System.out.println(mapClass.getName() + " declaro la anotation \""+ Archivo.class.getName()+"\".");
			System.out.println("Esta indica que se quiere mapear en \""+ nombreArchivo+"\""+".");
			
			System.out.println("- REALIZANDO MAPEO...");
			Mapeador.mapear(nombreArchivo, mapClass);
			System.out.println("- MAPEO REALIZADO.");
		} 
	}
}
