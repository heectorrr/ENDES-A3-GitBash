package Ejemplos;

public class Ejemplo2 {
	static int n1=33; //Aqui declaramos el primer numero
	static int n3=3; //Aqui declaramos el tercer numero
	public static void main (String[]args) {
		int n2=66, resta=0, suma=0;//Le doy valor para que en caso de bucle siempre coja valor la variable suma
		//Son variables locales
		resta=n1-n2;
		suma=n1+n2;
		System.out.println("La resta es: "+ resta);
		System.out.println("La suma es: "+ suma);
		System.out.println(resta=n1-n2);
		//modificado
	}
}
//Las variables se pueden declarar tanto fuera de la ejecucion como fuera (INT)(Static int)
