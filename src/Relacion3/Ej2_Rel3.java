// Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
// comprendido entre uno y diez, introducido por el usuario, usando un esquema 
// while.

package Relacion3;

import java.util.Scanner;

public class Ej2_Rel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int num;
		int x = 1;
		
		System.out.println("Introduce un numero para saber su tabla de multiplicar: ");
		num = teclado.nextInt();

		while (x <= 10)
	{
			System.out.println(num+"*"+x+"="+num*x);
			
			x++;
			
	}	
		teclado.close();
	}

}
