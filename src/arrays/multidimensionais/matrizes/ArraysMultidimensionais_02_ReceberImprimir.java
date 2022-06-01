package arrays.multidimensionais.matrizes;

import java.util.Scanner;

public class ArraysMultidimensionais_02_ReceberImprimir {
	
/*	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [][] notas = new int [3][2] ;
		
		// Capturar dados
		
		for (int i = 1; (notas.length + 1) > i ; i ++){
			
			System.out.println("Digite as notas do Aluno " + i );	
			
			// o "notas[i].length" indica a quantidade de posições que o vetor notas [i] contém
			//ex : notas [0] == 2 ; notas [1].lenght == 2 ; notas [2].lenght == 2 ; 
			
			for ( int j = 1 ; (notas[(i - 1)].length + 1) > j ; j ++){
				
				System.out.println("Digite a nota da prova " + j + " :" );
				
				// como adicionamos 1 ao i, logo ao j, temos que tirar 1 quando for colocar no vetor, pois
				// se não, n vai existir o vetor notas[0] e vai faltar um vetor 
				
				notas [(i - 1)][(j - 1)] =scan.nextInt() ;			
				
				System.out.println( "Aluno : " + i + " ; "+ " Porva : " + j + " ; " + " Nota : "+notas [(i - 1)][(j - 1)]);
				System.out.println(" ");
			}
		
		}
		
		// Exibir Dados 
		
		for (int i = 1; (notas.length + 1) > i ; i ++){
			
			for ( int j = 1 ; (notas[(i -1)].length + 1) > j ; j ++){
				
				System.out.println("A nota da prova " + j + ", do aluno " + i + " :" + notas [( i-1 )][( j-1 )] );		

			}		
		}				
	}*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [][] notas = new int [3][2] ;
		
		// Capturar dados
		
		for (int i = 0; notas.length > i ; i ++){
			
			System.out.println("Digite as notas do Aluno " + ( i + 1 ));	
			
			// o "notas[i].length" indica a quantidade de posições que o vetor notas [i] contém
			//ex : notas [0] == 2 ; notas [1].lenght == 2 ; notas [2].lenght == 2 ; 
			// adicionamos + 1 no i em : System.out.println("Digite as notas do Aluno " + ( i + 1 ));
			// pois queremos que exiba para a interface " Digite as notas do Aluno 1", e não, "Aluno 0", por isso adicionamos 1 ao i
			
			for ( int j = 0 ; notas[i].length > j ; j ++){
				
				System.out.println("Digite a nota da prova " + ( j + 1 ) + " :" );
				
				// adicionamos + 1 no i em : System.out.println("Digite a nota da prova " + ( j + 1 ) + " :" );
				// pois queremos que exiba para a interface " Digite a notas da prova 1", e não, "prova 0", por isso adicionamos 1 ao i

				notas [i][j] =scan.nextInt() ;			
				
				System.out.println( "Aluno : " + (i+1) + " ; "+ " Porva : " + (j+1) + " ; " + " Nota : "+notas [i][j]);
				System.out.println(" ");			
			}
		
		}
		
		// Exibir Dados 
		
		for (int i = 0; notas.length > i ; i ++){
			
			for ( int j = 0 ; notas[i].length > j ; j ++){
				
				System.out.println("A nota da prova " + (j+1) + ", do aluno " + (i+1) + " :" + notas [i][j] );		

			}		
		}				
	}

}
