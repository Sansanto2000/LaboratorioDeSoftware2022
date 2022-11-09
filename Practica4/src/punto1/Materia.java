package punto1;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.HashSet;
import java.util.TreeSet;

public class Materia<E> {
	private String nombre;
	//private HashSet<Alumno> nomina;
	private Collection<E> nomina;
	
	Materia(String nombre){
		this.nombre = nombre;
		this.nomina = new TreeSet<E>();
	}
	
	public void agregarAlumno(E a) {
		this.nomina.add(a);
	}
	
	public Collection<E> getAlumnos() {
		return this.nomina;
	}
}
