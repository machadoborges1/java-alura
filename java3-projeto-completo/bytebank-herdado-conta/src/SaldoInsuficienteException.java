
//unchecked 
//public class SaldoInsuficienteException extends RuntimeException {


//checked
public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
    //deu erro na classe conta, temos que colocar uma assinatura no método
}

