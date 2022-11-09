package punto3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyHandler implements HttpHandler {
	
	private int contador = 0;
	private Method m;
	private String nombreArchivo;
	
	public MyHandler(Method m, String nombreArchivo) {
		this.m = m;
		this.nombreArchivo = nombreArchivo;
	}

	public void handle(HttpExchange t) throws IOException {
		
		String response = "Esta es la respuesta numero "+this.contador;
		System.out.println("Respondiendo ("+this.contador+")");
		try {
			 m.invoke(null);
		} catch (Exception exc) {
			System.out.println("INVALIDO @Invocar: " + m);
		}
		
		DateTimeFormatter dtfecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dthora = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime dt = LocalDateTime.now();
        String fecha = dtfecha.format(dt);
        String hora = dthora.format(dt);;
		
	    FileWriter fichero = new FileWriter("./src/punto3/"+this.nombreArchivo,true);
	    fichero.write("IP="+t.getRemoteAddress()+" Fecha="+fecha+" Hora="+hora+" \r\n");
	    fichero.close();
	    
	    this.contador++;
         
		t.sendResponseHeaders(200, response.length());
		OutputStream os = t.getResponseBody();
		os.write(response.getBytes());
		os.close();
		 
	}
}
