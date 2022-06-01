package controle.de.decisao;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		 int numero = 3 ;
		 
		 switch (numero) {
		 
		 case 1 : System.out.println ("1"); break;
		 case 2 : System.out.println ("2"); break;
		 case 3 : System.out.println ("3"); break;
		 case 4 : System.out.println ("4"); break;
		 case 5 : System.out.println ("5"); break;
		 case 6 : System.out.println ("6"); break;
		 case 7 : System.out.println ("7"); break;
		 default : System.out.println ("0");
		 
     /*  case 1 : System.out.println ("1"); break;
		 case 2 : System.out.println ("2"); break;
		 case 3 : System.out.println ("3"); break;
		 case 4 : System.out.println ("4"); break;
		 case 5 : System.out.println ("5"); break;
		 case 6 : System.out.println ("6"); break;
		 case 7 : System.out.println ("7"); break;
		 default : System.out.println ("0");  */
		 
		 //caso eu não coleque o "break", o código será execultado sem parar, execultando o case 3,4,5,6 e 7
		 
         }
		
	}

}
