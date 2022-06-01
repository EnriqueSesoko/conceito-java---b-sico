package ler.variavel;

import java.util.Scanner;

public class Scan {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("digite o seu nome :");
		
	    String nome = scan.next(); 
		/*String nome = scan.nextLine();*/
	    // o "scan.nextLine()" vai ler a linha inteira ao contrário do "scan.next()" que só vai ler a primeira palavra
	    // fora o "scan.next()", exite : "scan.nextInt()"; "scan.nextBoolean()"; "scan.Double(); "scan.nextLong()"...
	    
	    System.out.println("o seu nome é :" + nome);    
		
    }

}
