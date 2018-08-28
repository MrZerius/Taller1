package Numeros;
import java.util.Scanner;

public class Numeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int a,b,c,d;
	
	System.out.println("Digite 4 numeros");
	
	System.out.println("Digite el primer numero: ");
	a = sc.nextInt();
	
	System.out.println("Digite el segundo numero: ");
	b = sc.nextInt();
	
	System.out.println("Digite el tercer numero: ");
	c = sc.nextInt();
	
	System.out.println("Digite el tercer numero: ");
	d = sc.nextInt();
	
	
	System.out.println("Los numeros digitados son: " + d +" " + c +" " + b +" " +a );
	
	sc.close();

}

}
