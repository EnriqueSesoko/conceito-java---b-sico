package arreys.vetores;

import javax.swing.JOptionPane;

public class Arreys {
	
	// 1
/*	public static void main(String[] args) {
		
		double [] temperatura = new double [365];
		
		temperatura[0] = 32.5;
		temperatura[1] = 33.1;
		
		System.out.println(temperatura[0]);
		System.out.println(temperatura[1]);	
		
	}*/
	
		
	//2
/*	public static void main(String[] args) {
		
		
		String i = JOptionPane.showInputDialog("Digite o índice :");
		
		int k = Integer.parseInt(i);
		
		// onde o k é o nuúmero de poisções existentes dentro do vetor double com nome de temperatura
			
		double [] temperatura = new double [k];
		
		for ( int a = 0; a < temperatura.length ; a ++){
			
			// Seria a mesma coisa do que ( int a = 0; a < k ; a ++)
			
			System.out.println(a);
			
			// O método ".lenght" nos permite visualizar o tamanho do vetor 
			
			System.out.println(temperatura.length);
			
			temperatura [a] = a + 1 ;
			
			System.out.println(temperatura [a]);
			
		}
	
	}*/
	
	
	//3
	public static void main(String[] args) {
		
		
		String i = JOptionPane.showInputDialog("Digite o índice :");
		
		int k = Integer.parseInt(i);
			
		double [] temperatura = new double [k];
		
		temperatura [1] = 10;
		
		for ( double temp:temperatura){
			
			//O "temp" é como se fosse você acessar a temperatura[] direto
			
			System.out.println("a" + temp);
			
			double res = temperatura[1] * 10;
			
			System.out.println("b" + res);
			
		}
			
	}
	
}

