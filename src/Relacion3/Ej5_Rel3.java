// Algoritmo que sume los n primeros números enteros, siendo n un número 
// introducido por el usuario

package Relacion3;

import java.util.Scanner;

public class Ej5_Rel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int n;
		int suma = 0;
		
		System.out.println("Introduce el numero : ");
		n= teclado.nextInt();
		
		for (int x = 0; x <= n; x++) {
			suma = suma+x;
			}
		System.out.println("El resultado de la suma es "+suma);
		
		teclado.close();	
	
	}

}
