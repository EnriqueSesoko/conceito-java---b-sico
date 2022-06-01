package controle.de.decisao;

import java.util.Scanner;

public class Método_equals {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o sexo, sendo  M :masculino ou F :femenino :");
		
		String sexo = scan.next() ;
		
		//Utilizamos o método ".equals()" para CLASSES, pois não conseguimos fazer a comparação convencional por se tratar de CLASSES e não um variável primitivo
		//O método ".equals()" serve não só para String, mas tambem para qualquer classe
		//O método ".equals()" consegue fazer a comparação direta, DIFERENCIANDO as MAIÚSCULAS DAS MINUSCULAS
		// NomeDaClasse.equals(escreve a condição)
		
		if ( sexo.equals("F")) {
			
			System.out.println("O sexo é femenino");
			
		}
		
		else {
			
			if ( sexo.equals("M")) {
				
				System.out.println("O sexo é masculino :");
			}
			
			else {
				
				System.out.println("Sexo inválido");
				
			}
		}		
	}
}
	
