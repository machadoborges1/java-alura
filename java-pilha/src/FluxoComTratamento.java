// com o checked o compilador te obriga a fazer a exceção

// CHECKED  forçando o compilador a verificar se a exceção estaria sendo tratada.

// diferença na hora de compilar entre unchecked e checked// na hora de rodar é semelhante.


public class FluxoComTratamento {

	//public static void main(String[] args) throws MinhaChecked {} //Precisamos mudar a assinatura do método para explicitar que ele pode lançar tal exceção.
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try{
		    metodo1();
		    } 
		
		
		
		// catch(Exception ex) {}  // CAPTURA QUALQUER TIPO DE EXCEÇÃO
		// pois todas elas tem Exception como classe mãe
		catch(ArithmeticException | NullPointerException | MinhaUnchecked ex) { // essa é uma forma especifica
		    String msg = ex.getMessage();
		    System.out.println("ArithmeticException " + msg);
		    ex.printStackTrace();
		} 
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
	    System.out.println("Ini do metodo2");
	    //throw new ArithmeticException("Deu erro");
	    throw new MinhaUnchecked("deu muito errado"); // Essa é a minha
	}
	
	private static void metodo3() throws MinhaChecked { // Tem que colocar na assinatura do método
														// por chamar o metodo5(), é obrigado a colocar que será checado esse método também
														// Precisamos mudar a assinatura do método para explicitar que ele pode lançar tal exceção.
		
		System.out.println("Ini do metodo3");
		metodo5();
		System.out.println("Fim do metodo3");
	}
	
	// pode se usar também o TRY CATCH que também resolve a exceção
	// EXEMPLO
	private static void metodo4() {
	    System.out.println("Ini do metodo4");
	    try {
	        metodo5(); //chamando metodo5() e resolvendo, ja que ele é verificado pelo compilador
	    } catch(MinhaChecked ex) {}
	    System.out.println("Fim do metodo4");
	}
	
	private static void metodo5() throws MinhaChecked { // 'throws' precisa estar explicito // Checado pelo compilador
	    System.out.println("Ini do metodo5");
	    throw new MinhaChecked("deu muito errado checked");

	    //System.out.println("Fim do metodo5");
	}
}



// existe essa forma também
//try {
//	 metodoPerigosoQuePodeLancarVariasExcecoes();
//	} catch(MinhaExcecao ex) {
//	 ex.printStackTrace();
//	} catch(OutraExcecao ex) {
//	 ex.printStackTrace();
//	}
