package transformação.de.variavel;

// NA REALIDADE VOCÊ NÃO USA MUITO O MÉTODO ".toString", POIS O PRÓPRIO COMPILADOR TRANSFORMA ELE AUTOMATICAMENTE EM STRING COMO PODE VER NO MÉTODO 2

public class InteiroParaString {
	
	
	// MÉTODO 1	
/*	public static void main(String[] args) {
		
		int numero = 10;
		
		Integer.toString(numero);
		
		System.out.println(numero);
		
		System.out.println(((Object)numero).getClass().getSimpleName());
				
	}*/
	
	
	// MÉTODO 2
	public static void main(String[] args) {
	
	  int b = 3; 
	  
	  String a = "a";
	  
	  a = "9" + b;
	  
	  System.out.println(a); 
	  
	  System.out.println(a.getClass().getSimpleName());

     } 
}
