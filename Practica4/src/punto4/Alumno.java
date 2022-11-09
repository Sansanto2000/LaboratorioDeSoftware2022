package punto4;

public class Alumno {
	private int nro_de_alumno;
	private String nombres;
	private String apellidos;
	private int edad;
	private String materia_aprobada;
	private int nota_de_aprobacion;
	
	public Alumno(int nro_de_alumno, String nombres, String apellidos, int edad, String materia_aprobada,
			int nota_de_aprobacion) {
		super();
		this.nro_de_alumno = nro_de_alumno;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.materia_aprobada = materia_aprobada;
		this.nota_de_aprobacion = nota_de_aprobacion;
	}

	public int getNota_de_aprobacion() {
		return nota_de_aprobacion;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getMateria_aprobada() {
		return materia_aprobada;
	}

	@Override
	public String toString() {
		return "Alumno [nro_de_alumno=" + nro_de_alumno + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", edad=" + edad + ", materia_aprobada=" + materia_aprobada + ", nota_de_aprobacion="
				+ nota_de_aprobacion + "]";
	}
	
	
	
	
	
	
}
