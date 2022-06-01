package arrays.multidimensionais.matrizes;

import javax.swing.JOptionPane;

public class ArraysMultidimensionais_03_3x3 {
	
	public static void main(String[] args) {
		
		int [][][] AlunoMat�riaTempoEstudoNota = new int [3][3][3] ;
		
		// int [][][] AlunoMat�riaTempoEstudoNota = new int [Aluno][Mat�ria][Tempo de Estudo] -> nota ;
		// De acordo com o aluno, a sua materia e o tempo de estudo, vai gerar uma nota
		
		AlunoMat�riaTempoEstudoNota [0][0][0] = 1;
		//AlunoMat�riaTempoEstudoNota [0 -> Aluno 0][Mat�ria -> 0][Tempo de Estudo -> 0] = nota, dessa forma : nota = 1;
		
		AlunoMat�riaTempoEstudoNota [0][0][1] = 2;
		AlunoMat�riaTempoEstudoNota [0][0][2] = 3;
		
		AlunoMat�riaTempoEstudoNota [0][1][0] = 4;
		AlunoMat�riaTempoEstudoNota [0][1][1] = 5;
		AlunoMat�riaTempoEstudoNota [0][1][2] = 6;
		
		AlunoMat�riaTempoEstudoNota [0][2][0] = 7;
		AlunoMat�riaTempoEstudoNota [0][2][1] = 8;
		AlunoMat�riaTempoEstudoNota [0][2][2] = 9;
		
		AlunoMat�riaTempoEstudoNota [1][0][0] = 10;
		AlunoMat�riaTempoEstudoNota [1][0][1] = 11;
		AlunoMat�riaTempoEstudoNota [1][0][2] = 12;
		
		AlunoMat�riaTempoEstudoNota [1][1][0] = 13;
		AlunoMat�riaTempoEstudoNota [1][1][1] = 14;
		AlunoMat�riaTempoEstudoNota [1][1][2] = 15;
		
		AlunoMat�riaTempoEstudoNota [1][2][0] = 16;
		AlunoMat�riaTempoEstudoNota [1][2][1] = 17;
		AlunoMat�riaTempoEstudoNota [1][2][2] = 18;

		AlunoMat�riaTempoEstudoNota [2][0][0] = 19;		
	    AlunoMat�riaTempoEstudoNota [2][0][1] = 20;
		AlunoMat�riaTempoEstudoNota [2][0][2] = 21;
		
		AlunoMat�riaTempoEstudoNota [2][1][0] = 22;
		AlunoMat�riaTempoEstudoNota [2][1][1] = 23;
		AlunoMat�riaTempoEstudoNota [2][1][2] = 24;
		
		AlunoMat�riaTempoEstudoNota [2][2][0] = 25;
		AlunoMat�riaTempoEstudoNota [2][2][1] = 26;
		AlunoMat�riaTempoEstudoNota [2][2][2] = 27;


		
		for (int i = 0 ; AlunoMat�riaTempoEstudoNota.length > i ; i ++) {
			
			for (int j = 0 ; AlunoMat�riaTempoEstudoNota[i].length > j ; j ++) {
				
				for (int k = 0 ; AlunoMat�riaTempoEstudoNota[i][j].length > k ; k ++) {
					
					JOptionPane.showMessageDialog( null," Aluno : " + i + " ; Mat�ria : " + j + " ; Tempo de Estudo : " + k + " ; Nota = " + AlunoMat�riaTempoEstudoNota[i][j][k]);
					
				}
				
			}
	
		}
				
	}

}
