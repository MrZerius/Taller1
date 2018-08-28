package Numero5;

import java.util.Scanner;

public class Numero5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int km;
	double ms;
	System.out.println("Ingrese la velocidad en k/m ");
	
	km = sc.nextInt();
	
	ms =  km * (1000/3600) ;
	
	
	System.out.println(ms = km * 1000/3600);
	
	System.out.println( + km + " km/h son " + ms + " m/s");
	
	
	sc.close();
	

}

}
