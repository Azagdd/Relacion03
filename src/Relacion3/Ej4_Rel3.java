// Algoritmo que escriba los números impares comprendidos entre dos enteros 
// introducidos por el usuario.

package Relacion3;

import java.util.Scanner;

public class Ej4_Rel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		System.out.println("Introduce el primer numero : ");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo numero : ");
		num2 = teclado.nextInt();
		
		if(num1%2==0) {
			num1++;
		}
		
		for( int x = num1; x < num2; x=x+2)
		
		{
			System.out.printf("Impar %d \n", x);
		}
		teclado.close();
	}

}
