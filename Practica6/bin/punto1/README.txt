1) 
- A priori no compila por que por que el nombre "Excepcion1" de la primera clase es 
distinto de "Exception1" del que hereda "Exception2", pero asumo que eso es solo un 
error de tipeo por lo que solo cambie "Exception1" por "Excepcion1".
- No es un error, pero el programa luego tiraba advertencias por la falta de serialsUI
asi que los agregue
- En la parte del main tambien hay confucion de nombres, asi que lo acomode segun lo 
que dije antes.
- Tambien salta error pero es por uso de faltas comillas, java espera "" como comillas
pero el programa usa otro simbolo. Simplemente remplaze los simbolos de comilla por el 
simbolo bueno.
- Luego de todo eso el unico error que queda es por que el primer catch atrapa tanto 
las "Exepcion1" como las "Exepcion2". Ya que "Exepcion2" extiende "Exepcion1". Como 
regla general, los catch especificados para una exepcion siempre atrapan a las 
subexepciones que hereden de estas. El compilador no deja por ende definir catchs para
exepciones que ya esten siendo consideradas en un catch superior. La solucion es simple.
Hay que hacer que primero se compruebe la clase de mas abajo y luego ir subiendo, en este 
caso seria primero "Exepcion2" y luego "Exepcion1".
- Luego de hacer eso solo queda una advertencia y es simplemente por que el compilador 
detecta que es imposible que se levante "Exeption1" en el codigo, y tiene razon. Pero no
quiero que salga el triangulito amarillo, asi que añadi la anotation 
@SuppressWarnings("hiding") para suprimirlo.