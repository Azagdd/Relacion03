// Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
// comprendido entre uno y diez, introducido por el usuario, usando un esquema for. 

package Relacion3;

import java.util.Scanner;

public class EJ1_Rel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un numero para saber su tabla de multiplicar: ");
		num = teclado.nextInt();
		
		 for(int x = 1; x <= 10; x++) {
			 System.out.println(num+"*"+x+"="+num*x);
		 }
		 
		 teclado.close();
	}

}
