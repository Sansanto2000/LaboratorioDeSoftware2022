package punto5;

import java.lang.NumberFormatException;

// Version 1
/*
public class Suma {
	public static void main(String[] args){
		int suma=0;
		for(int i=0;i<args.length;i++)
			try {
				suma+= Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				System.out.println(args[i]);
			}
		System.out.print("La suma es:"+suma);
	}
}
*/

//Version 2
public class Suma {
	public static void main(String[] args){
		int suma=0;
		for(int i=0;i<=args.length;i++)
			try {
				suma+= Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				System.out.println(args[i]);
			} catch (Exception e) {
				break;
			}
		System.out.print("La suma es:"+suma);
	}
}
