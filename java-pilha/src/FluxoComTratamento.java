// com o checked o compilador te obriga a fazer a exce��o

// CHECKED  for�ando o compilador a verificar se a exce��o estaria sendo tratada.

// diferen�a na hora de compilar entre unchecked e checked// na hora de rodar � semelhante.


public class FluxoComTratamento {

	//public static void main(String[] args) throws MinhaChecked {} //Precisamos mudar a assinatura do m�todo para explicitar que ele pode lan�ar tal exce��o.
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try{
		    metodo1();
		    } 
		
		
		
		// catch(Exception ex) {}  // CAPTURA QUALQUER TIPO DE EXCE��O
		// pois todas elas tem Exception como classe m�e
		catch(ArithmeticException | NullPointerException | MinhaUnchecked ex) { // essa � uma forma especifica
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
	    throw new MinhaUnchecked("deu muito errado"); // Essa � a minha
	}
	
	private static void metodo3() throws MinhaChecked { // Tem que colocar na assinatura do m�todo
														// por chamar o metodo5(), � obrigado a colocar que ser� checado esse m�todo tamb�m
														// Precisamos mudar a assinatura do m�todo para explicitar que ele pode lan�ar tal exce��o.
		
		System.out.println("Ini do metodo3");
		metodo5();
		System.out.println("Fim do metodo3");
	}
	
	// pode se usar tamb�m o TRY CATCH que tamb�m resolve a exce��o
	// EXEMPLO
	private static void metodo4() {
	    System.out.println("Ini do metodo4");
	    try {
	        metodo5(); //chamando metodo5() e resolvendo, ja que ele � verificado pelo compilador
	    } catch(MinhaChecked ex) {}
	    System.out.println("Fim do metodo4");
	}
	
	private static void metodo5() throws MinhaChecked { // 'throws' precisa estar explicito // Checado pelo compilador
	    System.out.println("Ini do metodo5");
	    throw new MinhaChecked("deu muito errado checked");

	    //System.out.println("Fim do metodo5");
	}
}



// existe essa forma tamb�m
//try {
//	 metodoPerigosoQuePodeLancarVariasExcecoes();
//	} catch(MinhaExcecao ex) {
//	 ex.printStackTrace();
//	} catch(OutraExcecao ex) {
//	 ex.printStackTrace();
//	}
