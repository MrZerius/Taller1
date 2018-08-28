package Numero6;

import java.util.Scanner;

public class Numero6B {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int num = 2;
	int cont = 0;
	
	while(num <= 50) {
		
		cont = cont + num;
		num = num +2;
	}
	
	
	System.out.println("La suma de los numeros pares del 2 al 50 es : "+cont++);
	
	
	sc.close();
	

}

}
