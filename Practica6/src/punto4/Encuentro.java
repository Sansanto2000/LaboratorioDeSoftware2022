package punto4;

@SuppressWarnings("serial")
class FutbolException extends Exception{}

@SuppressWarnings("serial")
class Falta extends FutbolException{}

@SuppressWarnings("serial")
class EquipoIncompleto extends FutbolException{}

@SuppressWarnings("serial")
class ClimaException extends Exception{}

@SuppressWarnings("serial")
class Lluvia extends ClimaException{}

@SuppressWarnings("serial")
class Mano extends Falta{}

class Partido {
	
	Partido() throws FutbolException{}
	
	void evento() throws FutbolException{}
	
	void jugada() throws EquipoIncompleto, Falta{}
	
	void penal(){}
}

interface Tormenta {
	void evento() throws Lluvia;
	void diluvio() throws Lluvia;
}

public class Encuentro extends Partido implements Tormenta {
	
	Encuentro() throws Lluvia, FutbolException{System.out.println("Constructor vacio Encuentro");}
	
	Encuentro (String fecha) throws Falta, FutbolException{System.out.println("Constructor con fecha Encuentro");}
	
	void penal(){System.out.println("Metodo penal");}
	
	public void evento() {System.out.println("Metodo evento");}
	
	public void diluvio() throws Lluvia{System.out.println("Metodo diluvio");}
	
	//public void evento(){System.out.println("Metodo evento sin exepcion");}
	
	void jugada() throws Mano{System.out.println("Metodo jugada");}
	
	public static void main (String[] args) {
		try {
			Encuentro enc = new Encuentro();
			enc.jugada();
		} catch(Mano e) {
		} catch(Lluvia e) {
		} catch(FutbolException e) {
			try {
				Partido par = new Encuentro();
				par.jugada();
			} catch(EquipoIncompleto ex) {
			} catch(Falta ex) {
			} catch(Lluvia ex) {
			} catch(FutbolException ex) {}
		}
	}
}

