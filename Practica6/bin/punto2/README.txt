2) 
- Al ejecutarlo asi nomas no deja ejecutarlo por que el compilador detecta el error
"Unreachable code", por el "print" que hay despues del 1er return. Si aun asi ignoramos 
el error y ejecutamos lo unico que pasa es que sale en consola la exepcion que les 
corresponde.
- Luego de eliminar los comentarios lo 1ro que pasa es que aparece una advertencia 
indicando que el bloque finally no se ejecutara normalmente. Lo cual es comprensible 
por el doble return. Al ejecutar lo que pasa es que hace el print del try, lugo el del
finaly y lo que devuelve al main es el 2 que devuelve el finally. Tiene sentido que se
ignore el return del try ya que esta establecido que el finally se ejecuta siempre 
independientemente de lo que ocurra en el try o catch.
- Igual que en el punto 1 añadi un @SuppressWarnings("finally") al metodo para 
suprimir la advertencia.