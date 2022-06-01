package controle.de.decisao;

import java.util.Scanner;

public class M�todo_equalsIgnoreCase {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o sexo, sendo  M :masculino ou F :femenino :");
		
		String sexo = scan.next() ;
		
		//O m�todo ".equalsIgnoreCase", � muito semelhante com o m�todo ".equals", na qual difere apenas no sentido de que N�O DIFERENCIA AS MAI�SCULAS DAS MINUSCULAS
		//Tanto o m�todo ."equals" quanto ".equalsIgnoreCase", possibila utilizar compara��es no controle de decis�o
		
		if ( sexo.equalsIgnoreCase("f")) {
			
			System.out.println("O sexo � femenino");
			
		}
		
		else {
			
			if (sexo.equalsIgnoreCase("m")) {
				
				System.out.println("O sexo � masculino :");
			}
			
			else {
				
				System.out.println("Sexo inv�lido");
				
			}
		}		
	}
}

