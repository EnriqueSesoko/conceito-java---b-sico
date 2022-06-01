package transformação.de.variavel;

public class StringParaDouble {
	
	public static void main(String[] args) {
		
		String numero = "10.0";
		
		double transformacaoNumero = Double.parseDouble(numero);
		
		System.out.println(((Object)transformacaoNumero).getClass().getSimpleName());
				
	}

}
