package Numero6;

import java.util.Scanner;

public class Numero6A {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int num = 1;
	int cont = 0;
	
	while(num <= 100) {
		
		cont = cont + num;
		num = num +1;
	}
	
	
	System.out.println("La suma de los numeros del 1 al 100 es: "+cont++);
	
	
	sc.close();
	

}

}
