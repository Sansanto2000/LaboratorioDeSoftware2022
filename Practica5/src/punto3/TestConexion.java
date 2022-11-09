package punto3;

@Servidor(direccion="/app", puerto=8000, archivo="conexion-info.txt")
public class TestConexion {
	
	@Invocar
	public static void conectar() {
		System.out.println("Conexion Establecida");
	}
	
}
