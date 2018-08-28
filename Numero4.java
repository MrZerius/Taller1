package Numero4;

import java.util.Scanner;

public class Numero4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int opcion1,opcion2;
	
	opcion1 = 2;
	
	System.out.println("Seleccione el dato a convertir");
	
	switch(opcion1) {
	
	case 1:
			{
				System.out.println("Bit (b)");
				break;
			}
	
	case 2:
			{
				System.out.println("Bytes (B)");
				break;
			}
			
	case 3:
			{
				System.out.println("Kilo Bytes (KB)");
				break;
			}
	
	case 4:
			{
				System.out.println("Mega Bytes (MB)");
				break;
			}
			
	case 5:
			{
				System.out.println("Giga Bytes (GB)");
				break;
			}
		
	case 6:
			{
				System.out.println("Tera Bytes (TB)");
				break;
			}
		
	}
	
	
	
	

}

}