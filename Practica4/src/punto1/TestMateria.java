package punto1;

public class TestMateria {

	public static void main(String[] args) {
		
		Materia<Alumno> materia = new Materia<Alumno>("Trituracion de Manzanas Aplicada");
		
		for(int i=0; i<10;i++) {
			materia.agregarAlumno(new Alumno("nombre"+i,"apellido"+i,"0000"+i+"/0",1000000+i));
		}
		
		for(Alumno a:materia.getAlumnos()) {
			System.out.println(a);
		}
	}

}
