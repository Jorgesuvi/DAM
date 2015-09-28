package Ejercicio1;


//Escribe una única clase que me pida la entrada de dos números 
//por teclado y realice la división.
//Si el divisor es 0, captura la excepción 

import java.io.*;

public class Ejercicio1 {
	public static void main(String args[]) {
		int i, j;
		String texto1;

		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(flujo);
		try {
			System.out.println("Escribe un número entero:");
			texto1 = teclado.readLine();
			i = (Integer.valueOf(texto1)).intValue();

			System.out.println("Escribe otro número entero:");
			texto1 = teclado.readLine();
			j = (Integer.valueOf(texto1)).intValue();

			System.out.println("La división de " + "" + i + "" + " entre " + "" + j + "" + " es " + "" + (i / j));
		} catch (Exception e) {
			// Imprime el texto indicado del error que se haya producido
			System.out.println(e.getMessage());
			// Imprime las llamadas producidas hasta el método generador de
			// error
			e.printStackTrace();
		}
	}
}