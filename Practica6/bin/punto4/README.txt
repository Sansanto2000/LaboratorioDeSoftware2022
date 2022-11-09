4) 
	- A las exepciones les agregue @SuppressWarnings("serial") por las advertencias
	de que no tienen serial version UI.
	- Recordemos que los "throws" nos indican que un determinado metodo puede llegar a 
	levantar las exepciones indicadas, por lo que el que use los metodos debe considerarlo. 
	- Error de sintaxis en "Tormenta" dice "inteface" en vez de "interface". Corregido.
	- Muchos metodos de Encuentro tienen de contenido "..", entiendo que indica que hay 
	codigo ahi, y que es solo a modo de referencia, por lo que los suplante por printlns 
	con el nombre de cada metodo.
	- El metodo evento esta duplicado, aunque levanten distintas exepciones no se permite
	que distintos metodos con los mismos parametros lleven nombres identicos. Por lo que 
	comente el que no tiene posibilidad de levantar una exepcion.
	- penal() tira error por que es un metodo heredado de Partido, donde no tira error, por 
	lo que no se tolera que sea sobreescrito en una subclase por un metodo indique una 
	exepcion. Se elimino el throws que traia.
	- evento() similar a lo ocurrido en penal(), pero esta vez por que define otra exepcion
	que su padre. Pero no se puede remplazar Lluvia por FutbolException ya que sino no 
	coincide con la interfaz Tormenta. Por lo que la unica alternativa es dejarlo sin exepciones. 
	Por lo que tendra que solucionar la exepcion del padre y parece que no es obligatorio 
	implementar las exepciones que indica una interfaz. Aunque parece estar bien implementarla 
	mientras no haya contradicciones, tal como vemos en diluvio().
	- El ultimo problema esta en "catch(FutbolException e)" ya que en el mismo se hace otro 
	try con sus propios catchs, pero estos tambien definen variables exeption "e", pero "e" ya 
	existe en el contexto por lo que para que no haya errores se les cambia el nombre a los 
	caths anidados por "ex". 
	- Por ultimo falto un "}" para cerrar la clase Encuentro.
	
	NOTA: teoria Excepciones diapositiva 27