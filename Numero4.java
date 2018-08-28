package Numero4;
import java.util.Scanner;
public class Numero4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int opcion1,n;
	double resul;
	
	
	
	System.out.println("Seleccione la opcion");
	
	System.out.println("Opciones");
	System.out.println(" 1: Bit (b) a Bytes (B)");
	System.out.println(" 2: Bytes (B) a KiloBytes (TB)");
	System.out.println(" 3: KiloBytes (KB) a MegaBytes (MB)");
	System.out.println(" 4: MegaBytes (MB) a GigaBytes (GB)");
	System.out.println(" 5: GigaBytes (GB) a Terabytes (TB)");
	System.out.println(" 6: TeraBytes (TB) a bit (b)");
	
	opcion1 = sc.nextInt();
	
	switch(opcion1) {
	
	case 1:
			{
				System.out.println("Digite la cantidad de bit");
				n = sc.nextInt();
				resul = n / 8;
				System.out.println("El resultado es "  +resul++ );
				break;
			}
	
	case 2:
			{
				System.out.println("Digite la cantidad de Bytes");
				n = sc.nextInt();
				resul = n / 1000;
				System.out.println("El resultado es "  +resul++ );
				break;
			}
			
	case 3:
			{
				System.out.println("Digite la cantidad de KiloByte");
				n = sc.nextInt();
				resul = n / 1000; 
				System.out.println("El resultado es "  +resul++ );
				break;
			}
	
	case 4:
			{
				System.out.println("Digite la cantidad de MegaByte");
				n = sc.nextInt();
				resul = n / 1000;
				System.out.println("El resultado es "  +resul++ );
				break;
			}
			
	case 5:
			{
				System.out.println("Digite la cantidad de GigaByte");
				n = sc.nextInt();
				resul = n / 1000;
				System.out.println("El resultado es "  +resul++ );
				break;
			}
		
	case 6:
			{
				System.out.println("Digite la cantidad de TeraByte");
				n = sc.nextInt();
				resul = n * 1000 * 1000 * 1000 * 8;
				System.out.println("El resultado es "  +resul++ );
				break;
			}
		
	}
	
	
	System.out.println("8 bit = 1 bytes");
	System.out.println("1000 bytes = 1 KiloByte");
	System.out.println("1000 KiloByte = 1 MegaByte");
	System.out.println("1000 MegaByte = 1 GigaByte");
	System.out.println("1000 GigaByte = 1 TeraByte");
	
	sc.close();
}}
	
	
	
