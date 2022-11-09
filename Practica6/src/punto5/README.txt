5) 
	a) Levanta una exepcion:
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 
		out of bounds for length 2 at Practica6/punto5.Suma.main(Suma.java:7)
	Probablemente tenga que ver con que el arreglo no tiene posicion 2, sino que es 0 
	y 1 nomas. Si se cambia el <= del for por un < el programa funciona bien.
	 
	b) Ahora la exepcion que levanta es con que no puede interpretar "four" como un 
	Integer. Añadi un cath para esa exepcion en especifico para que haga lo que pide 
	el enunciado. El catch funciono bien, pero ahora salta la exepcion del inciso 1, 
	tengo 2 opciones agregar un manejador para esa otra exepcion o corregir el for, 
	pienso que es mejor corregir el for, en cuanto a buenas practicas, por lo que eso 
	hice. Y luego de eso el programa funciono bien. 
	 
	c) Por que corregi el for, supongo que podria haber añadido otro catch Exeption para 
	que haga break en cualquier otro caso y asi sale del for, es mas lo deje anotado como
	otra vercion.