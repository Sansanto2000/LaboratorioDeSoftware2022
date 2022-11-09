package punto2;

public class TestVeterinaria {

	public static void main(String[] args) {
		// Inciso i)
		/*
		 * Veterinaria <Animal> vet = new Veterinaria <Gato>();
		 */
		
		// Inciso ii)
		/*
		 * Veterinaria <Gato> vet = new Veterinaria <Animal>();
		 */
		// Inciso iii)
		/*
		 * Veterinaria <?> vet = new Veterinaria<Gato>();
		 * vet.setAnimal(new Gato());
		 */
		
		
		// Inciso iv)
		/*
		 * Veterinaria vet = new Veterinaria ();
		 * vet.setAnimal(new Perro());
		 */
		
		// Inciso v)
		/*
		 * Veterinaria vet = new Veterinaria <?>();
		 */
		
		// Inciso vi)
		/*
		 * Veterinaria <? extends Animal> vet = new Veterinaria<Gato>();
		 */
	}

}
