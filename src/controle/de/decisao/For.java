package controle.de.decisao;

public class For {
	
	public static void main(String[] args) {
		
		 for ( int i = 0; i < 3; i++ ) {

			// for ( inicializa��o ; condi��o ; atualiza��o ) 

			 System.out.println (i);
			 
			}
		 
			// eu n�o consigo ver o �i� fora do �for�, pois o �i� � uma vari�vel de escopo local

	}

}

/* for ( int i = 0 ; int j = 5 ; i <  j ; i++ ; j -- ) {

// for ( contador 1 / inicializa��o 1 ; contador 2 / inicializa��o 2 ;  condi��o ; atualiza��o 1 ; atualiza��o 2 ) 

 System.out.println ( �i =� + i );
 System.out.println ( � j =� + j );
 
}
}

// Sa�da :

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
