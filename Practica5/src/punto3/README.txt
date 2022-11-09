3) 

UTIL: 
	Link para solucionar problemas de importacion:
		https://stackoverflow.com/questions/13155734/eclipse-cant-recognize-com-sun-net-httpserver-httpserver-package
	Si el anterior link no funciona, a mi me funciono hacer lo siguiente:
		1. Ir a Project > Propieties > Java Build Path > Libraries > JRE System Libraries > Edit
		2. Cambiar el ambiente de ejecucion a java 1.8
	Asi me funciona, NOTA: tira un error en el (default package) pero no altera el funcionamiento
	por lo que simplemente se puede ignorar.
	
NOTA IMPORTANTE: Recien me di cuenta luego de pasar los problemas, pero revisar las ultimas 3 
diapositivas de la explicacion de HTTP request y ahi esta todo lo necesario para poder levantar 
un servidor casero, no explica mucho, pero incluso estan los pasos que hay que seguir para los 
problemas de importacion que me ocurrieron.