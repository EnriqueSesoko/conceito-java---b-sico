package algoritimo.busca;

public class BuscaBi {
	
	Armazenamento armazenamento = new Armazenamento ();	
	int inicio = 0;
	int meio = 0;
	int fim = armazenamento.vet.length;
	int indice = (armazenamento.vet.length) ;	
	public BuscaBi (){
		super();
	}
	
	public void busca (int alvo) {
		
		System.out.println("a : " +armazenamento.vet.length);
		System.out.println("i : " +inicio);
		System.out.println("m : "+meio);
		System.out.println("f : "+fim);
		
		if (inicio <= fim) {
			
			meio = (int) ( (inicio + fim)  /2 ) ;
			System.out.println("m : "+meio);
			
			if (armazenamento.vet[meio] == alvo){
				indice = meio ;			
			}
			else if (armazenamento.vet[meio] > alvo){
				fim = (meio -1  );	
				System.out.println("i : " +inicio);
				System.out.println("m : "+meio);
				System.out.println("f : "+fim);
				busca(alvo);
			}
			else {
				inicio = (meio + 1);
				System.out.println("i : " +inicio);
				System.out.println("m : "+meio);
				System.out.println("f : "+fim);
				busca(alvo);
			}
		}				
	}
	public int retornaBusca (){
		return this.indice;
	}
}
