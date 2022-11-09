1) La clase no compila. Evidentemente es por que el metodo no esta implementado 
en la clase 'Object' de la que TestSobreescritura extiende por defecto. Si eliminamos 
la anotacion desaparece el error de compilacion. 
Para testear si se podia ejecutar el metodo independientemente del error de compilacion 
cree una clase TestTestSobreescritura que crea una instancia de TestSobreescritura y 
llama al metodo toString sobre la misma e imprime el resultado en consola. Al intentar 
ejecutar se levanta una exepcion ya que no hay un problema de compilacion sin resolver 
(ya sabemos de cual se trata). Entiendo que el que tire error en ejecucion es un tema 
de eclipce que implementa controles para ello, por lo que entiendo, normalmente, las 
anotaciones solo aportan metainformacion, el programa se podria ejecutar perfectamente 
aunque la metainformacion no se controlase. 
	
	a) Se imprime en consola "Testeando: 'Deprecated'", lo cual es lo que 
	hace el metodo "@deprecated hacer()" de TestDeprecated.
	
	b) Al no suprimir las advertencias el compilador advierte que el metodo
	"hacer()" esta deprecado y por lo tanto no se recomienda su uso. Aun asi 
	el resultado de la ejecucion es el mismo que en el inciso "a)".
	
	c) En ambos casos suprime las advertencias respecto a metodos deprecados,
	sin embargo si anotamos el metodo la advertencia solo es suprimida en 
	este. Sin embargo si anotamos la clase entonces la advertencia es 
	suprimida en todos los metodos de la clase.