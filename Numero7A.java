package Numero7;

import java.util.Scanner;

public class Numero7A {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int num,i,result;

	System.out.println("Ingrese el numero del cual desea saber la tabla");
	
	num = sc.nextInt();
	
	System.out.println("Tabla de multiplicacion");
	for(i=1; i<=12; i++) {
		
		result = num * i;
		
		System.out.println(+num+ " x " +i+ " = " +result++);
		
		
	}
	sc.close();
	

}

}
