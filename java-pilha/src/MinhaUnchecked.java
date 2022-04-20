//As classes ArithmeticException e NullPointerException herdam de RuntimeException, 
//considerando que nessa classe só existem construtores, 
//e ela herda de Exception que também só possui construtores. 
//Exception é a última classe que herda de Throwable.


//MinhaUnchecked -> RuntimeException -> Exception -> Throwable
//RuntimeException --- não verificado pelo compilador
//UNCHECKED 
public class MinhaUnchecked extends RuntimeException {
    
	public MinhaUnchecked(String msg) {
    	super(msg);
    }
}