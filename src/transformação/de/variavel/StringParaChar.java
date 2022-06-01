package transformação.de.variavel;

public class StringParaChar {
	
/*	public static void main(String[] args) {
		
		String s = "A" ;
		
		System.out.println(s.getClass().getSimpleName() + " " + s);
		
		// o método ".charAt(0)" transforma a letra da String em char, você escolhe o local da palavra que quer transformar, para isso o index, ou seja o número que está entre parenteses 
		// String nada mais que é do que um vetor de char, dessa forma eu escolho a posição começando o zero
		
		char c = s.charAt(0);
		
		System.out.println(((Object)c).getClass().getSimpleName() + " " + c);
	}*/
	
	public static void main(String[] args) {
		
		String s = "AbDe" ;
		
		System.out.println(s.getClass().getSimpleName() + " " + s);
		
		//o método ".toCharArray" transforma a palavra inteira de String em um vetor de Char
		
		char [] c = s.toCharArray();
		
		System.out.println(((Object)c).getClass().getSimpleName() + " " + c);
		
		//Aparece algo estranho, isto porque agora é um vetor com elementos, ou seja precisam ser exibidos um de cada um, para isso usaremos o for com loops
		
		// Este número estranho que apareceu é o endereço de memória onde está armazenados esse vetor de char		
		
		//Dessa forma, aplicamos o loop para exibir cada ítem do vetor de char
		
		for ( int i = 0; i < c.length ; i ++) {
			
			System.out.println( c [i] + " " +((Object)c[i]).getClass().getSimpleName()) ;
		}		
	}	
}
