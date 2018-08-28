package Num2;

import java.util.Scanner;

public class Numer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int num;
	
	System.out.println("Digite el numero que desea potenciar");
	
	System.out.println("Digite el numero: ");
	num = sc.nextInt();
	
	int resultado = (int) Math.pow(num, 2);
	System.out.println(num + " elevado a la 2 es igual a " + resultado);
	
	
	int resul2 = (int) Math.pow(num, 4);
	System.out.println(num + " elevado a la 4 es igual a " + resul2);
	
	
	int resul3 = (int) Math.pow(num, 5);
	System.out.println(num + " elevado a la 5 es igual a " + resul3);
	
	
	sc.close();
	

}

}