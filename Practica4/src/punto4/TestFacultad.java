package punto4;

public class TestFacultad {

	public static void main(String[] args) {
		
		Facultad fac = new Facultad();
		
		System.out.println("El estudiante con mejor nota fue: ");
		System.out.println(fac.getEstudianteConMayorNota());
		
		System.out.println("");
		
		fac.imprimirNEstudiantes(2);
		
		System.out.println("");
		
		System.out.println("Estudiantes que cursaron \"Laboratorio de Software\": ");
		for(Alumno alumno: fac.getCursaronXMateria("Laboratorio de Software")) {
			System.out.println(alumno);
		}
		
		System.out.println("");
		
		System.out.println("Estudiantes con inicial \"P\" y con nombres de largo a lo mucho 6: ");
		for(Alumno alumno: fac.getAlumnosConInicialXConLargoALoMuchoY('P', 6)) {
			System.out.println(alumno);
		}
		
		System.out.println("");
		
		System.out.println("Estudiantes de la Facultad (antes de ordenar): ");
		for(Alumno alumno: fac.getAlumnos()) {
			System.out.println(alumno);
		}
		
		System.out.println("");
		
		fac.ordenarPorNota();
		System.out.println("Estudiantes de la Facultad (despues de ordenar): ");
		for(Alumno alumno: fac.getAlumnos()) {
			System.out.println(alumno);
		}
		
		
		
	}

}
