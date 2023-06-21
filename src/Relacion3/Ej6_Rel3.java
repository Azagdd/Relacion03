// Algoritmo que calcule el factorial de un número entero introducido por el usuario.

package Relacion3;

import java.util.Scanner;

public class Ej6_Rel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int n;
		int factorial = 1;
		
		System.out.println("Introduce el numero : ");
		n= teclado.nextInt();
		
		for (int x = 1; x <= n; x++) {
			factorial = factorial*x;
			}
		System.out.println("El resultado factorial de " +n+ " es " +factorial);
		
		teclado.close();	
	}

}
