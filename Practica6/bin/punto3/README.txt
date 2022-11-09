3)
	- A priori no hay ninguna advertencia o error asi que proceso con la ejecucion.
	- La salida es:
		> Test3
		> Primer try
		> Finally del 2º try
		> Se capturó la Excepción ex del 1º Primer try
		> Finally del 1º try
	Como podemos ver la exepcion es levantada en el 2do try, pero no es tradada en 
	este, asi que se propaga hasta el 1er try, donde es atrapada por el catch del 
	mismo y en consecuencia tratada, luego de eso el programa finaliza exitosamente.