package Numero7;

import java.util.Scanner;

public class Numero7B {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int num,i,result=1;

	System.out.println("Ingrese el numero el cual desea factorizar:");
	
	num = sc.nextInt();
	
	System.out.println("Factorizacion");
	for(i=1; i<=num; i++) {
		
		result = result * i;
	}
	
	System.out.println("El factorial de " +num+ " es " +result++);
	sc.close();
	

}

}
