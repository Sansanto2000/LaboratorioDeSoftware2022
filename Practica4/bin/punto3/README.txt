IMPORTANTE: ESTE README ESTA DESACTUALIZADO, SE HICIERON MUCHOS CAMBIOS 
DESDE QUE SE ESCRIBIO Y LUEGO DE ESTOS EL MISMO NO FUE ACTUALIZADO.
POR LO QUE PUEDEN APARECER INCOERENCIAS EN ESTE RESPECTO AL CODIGO QUE
LE CORRESPONDE.

3) El enunciado es un poco confuso, pero luego de leerlo varias veces se 
entiende lo suficiente. 
Nota importante: el diccionario a generar tiene arrayList de String que 
corresponden con las palabras que contienen la Grama en cuestion, NO es 
un arrayList de las gramas anteriores. Lo especifico, por que al inicio 
yo pense que era asi, ya que al inicio, al ver el cuadro da esa 
sensacion.

	a) Para crear el diccionario no me complique y simplemente arme una
	clase "DiccionarioDeGramas" que extiende de "HashMap", el tipo 
	parametrizado de este ultimo lo deje fijo en 
	<String, ArrayList<String>> ya que es lo que el problema requiere. 
	Unicamente sobreEscribi el metodo "put(key,value)" para que 
	controle que los gramas que se intentan añadir son de Q=2, si no lo
	son entonces avisa por consola, no agrega nada y devuelbe null. 
	Tambien se fija de filtrar todos los Strings del arreglo recibido 
	para setear como value aquellos que incluyan el grama que le 
	corresponde a la Key.
	NOTA: para evaluar si un grama esta en una palabra se usa un string
	auxiliar que el "#"+palabra+"$", ya que los gramas pueden incluir 
	estos 2 simbolos.
	
	b) En este inciso hay que implementar un motor de comparacion, no es
	necesario complicarse con los detalles, parece viable ir al punto 
	simplemente haciendo lo que se dice.
	NOTA: Tube que modificar un poco el diccionario hecho en el insiso a)
	ya que parece que el diccionario es el que debia tener algun tipo de 
	diccionario de palabras. Quedo un poco vulnerable la interfaz al 
	modificar los parametros de put, una accione que podria 
	solucionarlo es que deje de extender de HashMap. Por ahora no lo 
	implementare, pero ahi lo dejo.