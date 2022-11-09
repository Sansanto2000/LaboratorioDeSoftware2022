package punto4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Facultad {
	private ArrayList<Alumno> alumnos;
	
	public Facultad() {
		this.alumnos = new ArrayList<Alumno>();
		this.alumnos.add(new Alumno(1, "Jose", "Cardenas", 22, "Programacion Concurrente", 7));
		this.alumnos.add(new Alumno(2, "Micaela", "Jefferson", 20, "Sistemas y Organizaciones", 6));
		this.alumnos.add(new Alumno(3, "Miguel", "Diaz", 21, "Laboratorio de Software", 8));
		this.alumnos.add(new Alumno(4, "Josefina", "Diaz Vazques", 19, "Algoritmos y estructuras de datos", 9));
		this.alumnos.add(new Alumno(5, "Sacarias Logan", "Clutch", 21, "Laboratorio de Software", 4));
		this.alumnos.add(new Alumno(6, "Pedro", "Aponte", 19, "Organizacion de computadoras", 7));
		this.alumnos.add(new Alumno(7, "Pamela", "Gorneo", 20, "Taller de programacion", 8));
		this.alumnos.add(new Alumno(8, "Priyanka Paula", "Aponte", 23, "Ingieneria de software3", 5));
	}
	
	public Alumno getEstudianteConMayorNota(){
		Alumno alumno = this.alumnos.stream()
				.max(Comparator.comparingInt(Alumno::getNota_de_aprobacion))
				.orElseThrow(NoSuchElementException::new);
		return alumno;
	}
	
	public void imprimirNEstudiantes(int N){
		if(N>this.alumnos.size()) {
			System.out.println("No se tienen "+N+" alumnos. Solo se tienen "+this.alumnos.size());
			System.out.println("A continuacion se imprimen los mismos:");
			N=this.alumnos.size();
		}
		for(int i=0;i<N;i++)
			System.out.println(this.alumnos.get(i));
	}
	
	public List<Alumno> getCursaronXMateria(String X){
		List<Alumno> alumnos = this.alumnos.stream()
				.filter(a -> a.getMateria_aprobada()==X)
				.collect(Collectors.toList());
		return alumnos;
	}
	
	public List<Alumno> getAlumnosConInicialXConLargoALoMuchoY(char X, int Y){
		List<Alumno> alumnos = this.alumnos.stream()
				.filter(a -> a.getNombres().charAt(0)==X)
				.filter(a -> a.getNombres().length()<=Y)
				.collect(Collectors.toList());
		return alumnos;
	}
	
	public void ordenarPorNota(){		
		// Version de punto 4)b)1)
		//this.alumnos.sort( (a1, a2) -> a1.getNota_de_aprobacion() - a2.getNota_de_aprobacion());
		
		// Version de punto 4)b)2) y 4)b)3)
		this.alumnos.sort(Comparator.comparingInt(Alumno::getNota_de_aprobacion));
	}
	
	public List<Alumno> getAlumnos() {
		return this.alumnos;
	}
}
