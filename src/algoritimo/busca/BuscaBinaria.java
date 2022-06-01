package algoritimo.busca;

import java.util.Scanner;

public class BuscaBinaria {
	
	public BuscaBinaria (){
		super();
	}
	
	public static void main(String[] args) {
		
		int vetor []= new int[5];
		vetor[0] = 10;
		vetor[1] = 12;
		vetor[2] = 24;
		vetor[3] = 36;
		vetor[4] = 48;
		
		boolean achou = false;
		int inicio = 0;
		int meio ;
		int fim = (vetor.length - 1);
		int alvo ;
		int indiceAlvo = 0;

		System.out.println("Digite o número alvo a ser achado");
		Scanner sc = new Scanner(System.in);
		alvo = sc.nextInt();
		
		while (inicio <= fim){
			
			/* esse (int) indica que queremos somente os valores inteiros
			 ou seja, caso o número der "quebrado" arrendamos a variável meio 
			para baixo */
			
			meio = (int) ((inicio + fim)  / 2) ;
			
			if (vetor[meio] == alvo){
				
				indiceAlvo = meio ;
				achou = true ;
				break;
			}
			else if (vetor[meio] > alvo){
				
				fim = (meio - 1);		
			}
			else {
				
				inicio = (meio + 1);
			}
		}
		
		if (achou == true){
			System.out.println( "Número achado com sucesso ");
			System.out.println("O alvo escolhido foi : " +vetor[indiceAlvo]+" o indice do alvo é " + indiceAlvo);
		}
		else {
			System.out.println(" Alvo não localizado - erro !!");
		}
	}
}
