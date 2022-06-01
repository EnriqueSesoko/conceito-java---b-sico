package breakk.continuee;

public class ContinueIf {
	
	public static void main(String[] args) {
		
		 for ( int i = 1; i < 10; i++ ) {
			 
			 if ( i % 2 == 0) {
				 
			 System.out.println (i);
			 
			 continue ;
			 
			 }		
	}

  }
	
}
	
	// Saída :

	//i = 2 ;
	//i = 4 ;
	//i = 6 ;
	//i = 8 ;

	// O código vai entrar na condicional if e vai executar a condicional, logo que entrar nela e vai executar e imprimir e executar o break, que vai sair do if e do loop
