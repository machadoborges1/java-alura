//As classes ArithmeticException e NullPointerException herdam de RuntimeException, 
//considerando que nessa classe s� existem construtores, 
//e ela herda de Exception que tamb�m s� possui construtores. 
//Exception � a �ltima classe que herda de Throwable.


//MinhaUnchecked -> RuntimeException -> Exception -> Throwable
//RuntimeException --- n�o verificado pelo compilador
//UNCHECKED 
public class MinhaUnchecked extends RuntimeException {
    
	public MinhaUnchecked(String msg) {
    	super(msg);
    }
}