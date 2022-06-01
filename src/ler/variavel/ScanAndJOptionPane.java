package ler.variavel;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ScanAndJOptionPane {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o seu nome :");
		
		String nome1 = scan.next();
		
		System.out.println(nome1);
		
		String nome2 = JOptionPane.showInputDialog("Digite o seu nome");
		
		JOptionPane.showMessageDialog(null, nome2);
		
	}

	
/*	public static void main(String[] args) {
		
		
		String k = JOptionPane.showInputDialog("Digite um número :");
		
		int num2 = Integer.parseInt(k);
		
		JOptionPane.showMessageDialog(null, num2);
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número :");
		
		int num = scan.nextInt();
		
		System.out.println(num);
				
	}*/
}