package controle.de.decisao;

import java.util.Scanner;

public class M�todo_equals {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o sexo, sendo  M :masculino ou F :femenino :");
		
		String sexo = scan.next() ;
		
		//Utilizamos o m�todo ".equals()" para CLASSES, pois n�o conseguimos fazer a compara��o convencional por se tratar de CLASSES e n�o um vari�vel primitivo
		//O m�todo ".equals()" serve n�o s� para String, mas tambem para qualquer classe
		//O m�todo ".equals()" consegue fazer a compara��o direta, DIFERENCIANDO as MAI�SCULAS DAS MINUSCULAS
		// NomeDaClasse.equals(escreve a condi��o)
		
		if ( sexo.equals("F")) {
			
			System.out.println("O sexo � femenino");
			
		}
		
		else {
			
			if ( sexo.equals("M")) {
				
				System.out.println("O sexo � masculino :");
			}
			
			else {
				
				System.out.println("Sexo inv�lido");
				
			}
		}		
	}
}
	
