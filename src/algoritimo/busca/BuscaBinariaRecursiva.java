package algoritimo.busca;

import java.util.Scanner;

public class BuscaBinariaRecursiva {
	
	public BuscaBinariaRecursiva(){
		
		super();		
	}
		public static void main(String[] args) {
			
			Armazenamento armazenamento = new Armazenamento ();	
			BuscaBi bi = new BuscaBi();
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite o alvo desejado :");
			int alvo = scan.nextInt();
			bi.busca(alvo);
			System.out.println(bi.retornaBusca());
			if (bi.retornaBusca() <= (armazenamento.vet.length - 1)){
				System.out.println("O alvo escolhido foi "+ alvo +" e o indice do alvo é " + bi.retornaBusca());			
			}
			else {
				System.out.println("Alvo não localizado - erro !!");
			}	
	}
}
