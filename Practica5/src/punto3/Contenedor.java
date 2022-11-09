package punto3;

import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

import java.lang.reflect.Method;

public class Contenedor {
	
	private static void levantarServidor(String direccion, int puerto, Method m, String nombreArchivo) throws Exception {
		HttpServer server = HttpServer.create(new InetSocketAddress(puerto),0);
		MyHandler handler = new MyHandler(m, nombreArchivo);
		server.createContext(direccion, handler);
		server.setExecutor(null);
		server.start();
		System.out.println("Servidor Levantado");
	}
	
	public static void main(String[] args) throws Exception {
		
		Class <?> serverClass = Class.forName("punto3.TestConexion");
		
		if(serverClass.isAnnotationPresent(Servidor.class)) {
			String direccion = serverClass.getAnnotation(Servidor.class).direccion();
			int puerto = serverClass.getAnnotation(Servidor.class).puerto();
			String nombreArchivo = serverClass.getAnnotation(Servidor.class).archivo();
			for (Method m : serverClass.getDeclaredMethods()) {
				 if (m.isAnnotationPresent(Invocar.class)) {
					 Contenedor.levantarServidor(direccion, puerto, m, nombreArchivo);
				 }
			}
		} 
	}
}
