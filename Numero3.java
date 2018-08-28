package Numero3;

import java.util.Scanner;

public class Numero3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int centi,result;
	
	System.out.println("Ingrese la temperatura en grados centigrados");
	
	centi = sc.nextInt();
	
	result = ((centi * 9) / 5)+32  ;
	
	

	System.out.println("grados centigrados " + centi+"º   grados Fahrenheit " +result+"º" );
	
	
	sc.close();
	

}

}