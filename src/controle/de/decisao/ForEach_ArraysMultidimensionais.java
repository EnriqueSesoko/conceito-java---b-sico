package controle.de.decisao;

public class ForEach_ArraysMultidimensionais {
	
	public static void main(String[] args) {
		
		int [][] notasAlunos = new int [3][2] ;
		
		notasAlunos [0][0] = 0 ;
		notasAlunos [0][1] = 1 ;
		
		notasAlunos [1][0] = 2 ;
		notasAlunos [1][1] = 3 ;
		
		notasAlunos [2][0] = 4 ;
		notasAlunos [2][1] = 5 ;
		
		for ( int notasAluno[] : notasAlunos ){
			
			for (int nota : notasAluno){
				
				System.out.println(nota);
			}
		}
				
	}

}
