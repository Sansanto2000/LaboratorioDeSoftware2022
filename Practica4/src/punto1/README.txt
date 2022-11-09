1) Definir clase Alumno con los atributos especificados. Sin problema.
	
	a) Definir coleccion generica de Alumnos. Sin problema.
	NOTA: Lo implemente con un HashSet, ya que pienso que tiene sentido
	que el mismo alumno no se pueda anotar 2 veces en la misma materia.
	
	b) Agregar metodos. Sin problema. 
	NOTA: Hice que getAlumnos devolvira una copia del arreglo para que 
	las modificaciones sobre el arreglo no comprometieran a a la materia
	no lo pide el enunciado, pero me parecio pertinente. 
	ACTUALIZACION 07/11/22: Ahora devuelve el arreglo 'nomina' original
	para mayor simplesa del codigo.
	
	c) Arme una clase llamada TestMateria y hice las comprobaciones 
	solicitadas. Tambien le agregue un metodo toString a Alumno asi puedo 
	corroborar que los elementos se agregaron adecuadamente. 
	
	d) No, la colleccion no esta ordenada. Pero remplazando el HashSet por 
	un TreeSet esto se puede solucionar. De hecho lo hice, pero tambien 
	tuve que hacer que Alumno implemente la interfaz comparable, ya que 
	sino el Tree Set no sabe segun que criterio debe ordenar el conjunto.
	Asi que agregue el metodo compareTo() e hice que se ordenen segun su 
	nombre.
	NOTA: Deje las lineas viejas comentadas por las dudas. 
	
	e) Modificando el metodo compareTo() que implemente en el inciso 
	anterior para que ahora decida el orden, primero por el apellido, y
	en caso de que coincidan que lo decida sobre el nombre. 
	
	d) Se puede implementar algo similar a lo descripto mediante 
	interfaces y/o con tipos genericos. A priori, si se quiere que una
	materia pudiese mantener la variable nomina con cualquier tipo de 
	elementos entonces habria que especificarlo en su declaracion. Una
	forma sencilla de hacerlo podria ser usando tipos genericos. Para 
	esta solucion en concreto simplemente hice que materia sea una clase
	parametrizada que se le indica que tipo de elementos contendra su 
	arreglo (en el caso de TestMateria es Alumno), y con el parametro de 
	tipo E que se reciba se decide que tipo de elementos contendra la 
	variable tipo Collection nomina.