package punto1;

public class Alumno implements Comparable<Alumno>{
	private String nombre;
	private String apellido;
	private String legajo;
	private int dni;
	
	Alumno(String nombre, String apellido ,String legajo, int dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.dni = dni;
	}
	
	public String toString() {
		String s="[ ";
		s+=this.nombre+" , ";
		s+=this.apellido+" , ";
		s+=this.legajo+" , ";
		s+=this.dni+" ]";
		return s;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	@Override
	public int compareTo(Alumno a) {
		int value = this.getApellido().compareTo(a.getApellido());
		if(value == 0) {
			value = this.getNombre().compareTo(a.getNombre());
		}
		return value;
	}
}
