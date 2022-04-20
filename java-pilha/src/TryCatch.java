
public class TryCatch {
	
	public static void main(String[] agrs) {
		
		try {
		    // ArithmeticException e NullPointerException s�o metodos e esse 'ex' � uma referecia
			// ArithmeticException | NullPointerException s�o tipo da referencia
			// pode-se adicionar mesagem de erro.
		} catch(ArithmeticException | NullPointerException ex) {
			
		    String msg = ex.getMessage(); // null // mensagem padr�o desse objeto � null
		    System.out.println("Exception " + msg); // Exception null
		    ex.printStackTrace(); // esse mostra a pilha de erro\execu��o.
		}
		
		private static void metodo2() {
		    System.out.println("Ini do metodo2");

		    ArithmeticException exception = new ArithmeticException(); // sobe la para o metodo com catch e retorna 'Exception "null"'
		    ArithmeticException exception = new ArithmeticException("mensagem"); // caso eu queira mudar a mensagem padr�o // 'Exception "mensagem"'
		    
		    throw new ArithmeticException("deu errado"); // assim ver� no dia a dia
		    
		    
		    // throws � usada para declarar uma exce��o.
		    // throw s� funciona com ex��es
		    throw exception; // joguei o erro no codigo! // joguei (excepption\referencia) na pilha
		    
		    Conta c = new Conta();
		    throw c; // s� funciona com exce��es.
		    
		    
		    System.out.println("Fim do metodo2"); // nem compila, porque joguei o erro no c�digo
		}
	}
	
}
