package transforma��o.de.variavel;

// NA REALIDADE VOC� N�O USA MUITO O M�TODO ".toString", POIS O PR�PRIO COMPILADOR TRANSFORMA ELE AUTOMATICAMENTE EM STRING COMO PODE VER NO M�TODO 2

public class InteiroParaString {
	
	
	// M�TODO 1	
/*	public static void main(String[] args) {
		
		int numero = 10;
		
		Integer.toString(numero);
		
		System.out.println(numero);
		
		System.out.println(((Object)numero).getClass().getSimpleName());
				
	}*/
	
	
	// M�TODO 2
	public static void main(String[] args) {
	
	  int b = 3; 
	  
	  String a = "a";
	  
	  a = "9" + b;
	  
	  System.out.println(a); 
	  
	  System.out.println(a.getClass().getSimpleName());

     } 
}
