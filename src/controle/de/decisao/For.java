package controle.de.decisao;

public class For {
	
	public static void main(String[] args) {
		
		 for ( int i = 0; i < 3; i++ ) {

			// for ( inicialização ; condição ; atualização ) 

			 System.out.println (i);
			 
			}
		 
			// eu não consigo ver o “i” fora do “for”, pois o “i” é uma variável de escopo local

	}

}

/* for ( int i = 0 ; int j = 5 ; i <  j ; i++ ; j -- ) {

// for ( contador 1 / inicialização 1 ; contador 2 / inicialização 2 ;  condição ; atualização 1 ; atualização 2 ) 

 System.out.println ( “i =” + i );
 System.out.println ( “ j =” + j );
 
}
}

// Saída :

   i = 0   j = 5
   i = 1   j = 4
   i = 2   j = 3


{
 int i = 0
 for (; i < 5;) {
       System.out.println (i);
        i++;
}
} */
