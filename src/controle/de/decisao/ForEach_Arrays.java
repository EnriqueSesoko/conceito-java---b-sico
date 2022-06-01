package controle.de.decisao;

public class ForEach_Arrays { 
	
	// Ela é muito boa para quando você só quer ver a variável
	
	public static void main(String[] args) {
		
		int [] notas = new int [3];
		
		notas [0] = 0 ;
		notas [1] = 5 ;
		notas [2] = 10 ;
		
		System.out.println("Usando FOR EACH : ");
		
		for ( int nota : notas){
			
			System.out.println(nota);
			
		}
		

//		É exatamente a mesma coisa que eu fizer :
		
		System.out.println("");
		
		System.out.println("Usando For Comum : ");
		
		for ( int i = 0 ; notas.length > i ; i ++) {
						
			int nota = notas [i];
			
			System.out.println(nota);
					
		}

	}

}
