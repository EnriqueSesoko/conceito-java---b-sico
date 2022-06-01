package transformação.de.variavel;

public class StringParaBoolean {
	
	public static void main(String[] args) {
		
		String parametro = "true";
		 
		boolean transformacaoParametro = Boolean.parseBoolean(parametro);
		
		System.out.println(parametro.getClass().getSimpleName());
		
		System.out.println(((Object)transformacaoParametro).getClass().getSimpleName());
	
		
	}
	
}
