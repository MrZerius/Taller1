package Numero6;

import java.util.Scanner;

public class Numero6C {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int num = 1;
	int cont = 0;
	
	while(num < 50) {
		
		cont = cont + num;
		num = num +2;
	}
	
	
	System.out.println("La suma de los numeros impares del 1 al 49 es : "+cont++);
	
	
	sc.close();
	

}

}
