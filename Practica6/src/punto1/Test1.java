package punto1;

class Excepcion1 extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}

class Excepcion2 extends Excepcion1{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}

public class Test1 {
	@SuppressWarnings("hiding")
	public static void main(String[] args) {
		try {
			throw new Excepcion2();
		} catch( Excepcion2 e2) {
			System.out.println("Se capturó la Excepción2");
		} catch(Excepcion1 e1) {
			System.out.println("Se capturó la Excepción1");
		} 
	}
}