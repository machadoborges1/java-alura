
public class TryCatch {
	
	public static void main(String[] agrs) {
		
		try {
		    // ArithmeticException e NullPointerException são metodos e esse 'ex' é uma referecia
			// ArithmeticException | NullPointerException são tipo da referencia
			// pode-se adicionar mesagem de erro.
		} catch(ArithmeticException | NullPointerException ex) {
			
		    String msg = ex.getMessage(); // null // mensagem padrão desse objeto é null
		    System.out.println("Exception " + msg); // Exception null
		    ex.printStackTrace(); // esse mostra a pilha de erro\execução.
		}
		
		private static void metodo2() {
		    System.out.println("Ini do metodo2");

		    ArithmeticException exception = new ArithmeticException(); // sobe la para o metodo com catch e retorna 'Exception "null"'
		    ArithmeticException exception = new ArithmeticException("mensagem"); // caso eu queira mudar a mensagem padrão // 'Exception "mensagem"'
		    
		    throw new ArithmeticException("deu errado"); // assim verá no dia a dia
		    
		    
		    // throws é usada para declarar uma exceção.
		    // throw só funciona com exções
		    throw exception; // joguei o erro no codigo! // joguei (excepption\referencia) na pilha
		    
		    Conta c = new Conta();
		    throw c; // só funciona com exceções.
		    
		    
		    System.out.println("Fim do metodo2"); // nem compila, porque joguei o erro no código
		}
	}
	
}
