package controle.de.decisao;

import java.util.Scanner;

public class Método_equalsIgnoreCase {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o sexo, sendo  M :masculino ou F :femenino :");
		
		String sexo = scan.next() ;
		
		//O método ".equalsIgnoreCase", é muito semelhante com o método ".equals", na qual difere apenas no sentido de que NÃO DIFERENCIA AS MAIÚSCULAS DAS MINUSCULAS
		//Tanto o método ."equals" quanto ".equalsIgnoreCase", possibila utilizar comparações no controle de decisão
		
		if ( sexo.equalsIgnoreCase("f")) {
			
			System.out.println("O sexo é femenino");
			
		}
		
		else {
			
			if (sexo.equalsIgnoreCase("m")) {
				
				System.out.println("O sexo é masculino :");
			}
			
			else {
				
				System.out.println("Sexo inválido");
				
			}
		}		
	}
}

