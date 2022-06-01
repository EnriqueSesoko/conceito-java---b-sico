package transformação.de.variavel;

public class StringParaInteiro {
	
	public static void main(String[] args) {
		
		String numeroString = "10" ;
		
		int numeroConvertido = Integer.parseInt(numeroString);
		
		System.out.println(numeroString + " " + numeroString.getClass().getSimpleName());
		
		System.out.println(numeroConvertido + " " + (((Object)numeroConvertido).getClass().getSimpleName()));
		
        System.out.println(numeroString.concat(numeroString.getClass().getSimpleName()));
		// o Método ".concat" ele concatena somente variáveis do tipo String
				
	}
	
}
