package arrays.multidimensionais.matrizes;

public class ArraysMultidimensionais_04_Irregular {
	
	public static void main(String[] args) {
		
		int [][] Irregular = new int [3][];
		
	    Irregular [0] = new int [1];
	    Irregular [1] = new int [2];
	    Irregular [2] = new int [3];
	    // Vou ter um ArrayMultidimensional com a : 1 linha com 1 coluna ;  1 linha com 2 colunas ; 1 linha com 3 colunas 
		/* Desenho o Array :		 
		                     []
		   		   		     [][]
		   		   		     [][][]		   		   		     
		 */
	    
	    Irregular [0][0] = 1 ;
	    
	    Irregular [1][0] = 2 ;
	    Irregular [1][1] = 3 ;
	    
	    Irregular [2][0] = 4 ;
	    Irregular [2][1] = 5 ;
	    Irregular [2][2] = 6 ;
	    
	    /* Desenho o Array :		 
                            [1]
 		                    [2][3]
 	                	    [4][5][6]	
 	                	    	
 	    */  
	    
	    for (int i = 0 ; Irregular.length > i ; i ++){
	    	
	    	for (int j = 0 ; Irregular[i].length > j ; j ++){
	    		
	    		System.out.println("O Valor do Irregular é " +  Irregular [i][j] + " quando i = " + i + " e o valor de j = " + j);
	    		
	    	}
	  
	    }   			    
	}
}
