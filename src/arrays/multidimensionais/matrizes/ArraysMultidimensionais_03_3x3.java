package arrays.multidimensionais.matrizes;

import javax.swing.JOptionPane;

public class ArraysMultidimensionais_03_3x3 {
	
	public static void main(String[] args) {
		
		int [][][] AlunoMatériaTempoEstudoNota = new int [3][3][3] ;
		
		// int [][][] AlunoMatériaTempoEstudoNota = new int [Aluno][Matéria][Tempo de Estudo] -> nota ;
		// De acordo com o aluno, a sua materia e o tempo de estudo, vai gerar uma nota
		
		AlunoMatériaTempoEstudoNota [0][0][0] = 1;
		//AlunoMatériaTempoEstudoNota [0 -> Aluno 0][Matéria -> 0][Tempo de Estudo -> 0] = nota, dessa forma : nota = 1;
		
		AlunoMatériaTempoEstudoNota [0][0][1] = 2;
		AlunoMatériaTempoEstudoNota [0][0][2] = 3;
		
		AlunoMatériaTempoEstudoNota [0][1][0] = 4;
		AlunoMatériaTempoEstudoNota [0][1][1] = 5;
		AlunoMatériaTempoEstudoNota [0][1][2] = 6;
		
		AlunoMatériaTempoEstudoNota [0][2][0] = 7;
		AlunoMatériaTempoEstudoNota [0][2][1] = 8;
		AlunoMatériaTempoEstudoNota [0][2][2] = 9;
		
		AlunoMatériaTempoEstudoNota [1][0][0] = 10;
		AlunoMatériaTempoEstudoNota [1][0][1] = 11;
		AlunoMatériaTempoEstudoNota [1][0][2] = 12;
		
		AlunoMatériaTempoEstudoNota [1][1][0] = 13;
		AlunoMatériaTempoEstudoNota [1][1][1] = 14;
		AlunoMatériaTempoEstudoNota [1][1][2] = 15;
		
		AlunoMatériaTempoEstudoNota [1][2][0] = 16;
		AlunoMatériaTempoEstudoNota [1][2][1] = 17;
		AlunoMatériaTempoEstudoNota [1][2][2] = 18;

		AlunoMatériaTempoEstudoNota [2][0][0] = 19;		
	    AlunoMatériaTempoEstudoNota [2][0][1] = 20;
		AlunoMatériaTempoEstudoNota [2][0][2] = 21;
		
		AlunoMatériaTempoEstudoNota [2][1][0] = 22;
		AlunoMatériaTempoEstudoNota [2][1][1] = 23;
		AlunoMatériaTempoEstudoNota [2][1][2] = 24;
		
		AlunoMatériaTempoEstudoNota [2][2][0] = 25;
		AlunoMatériaTempoEstudoNota [2][2][1] = 26;
		AlunoMatériaTempoEstudoNota [2][2][2] = 27;


		
		for (int i = 0 ; AlunoMatériaTempoEstudoNota.length > i ; i ++) {
			
			for (int j = 0 ; AlunoMatériaTempoEstudoNota[i].length > j ; j ++) {
				
				for (int k = 0 ; AlunoMatériaTempoEstudoNota[i][j].length > k ; k ++) {
					
					JOptionPane.showMessageDialog( null," Aluno : " + i + " ; Matéria : " + j + " ; Tempo de Estudo : " + k + " ; Nota = " + AlunoMatériaTempoEstudoNota[i][j][k]);
					
				}
				
			}
	
		}
				
	}

}
