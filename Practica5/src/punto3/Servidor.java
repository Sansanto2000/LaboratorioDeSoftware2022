package punto3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Servidor {
	
	// Indica la dirección IP a la cual se conectarán los clientes
	String direccion();
	
	// Indica el puerto donde espera las conexiones de los clientes.
	int puerto();
	
	// Indica el archivo en el que se guardará la información de login.
	String archivo();
	
}
