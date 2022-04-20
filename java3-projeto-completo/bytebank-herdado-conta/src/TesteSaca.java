// SEM TRATAMENTO

/*
public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);
        conta.saca(200.0); //TEM UMA TAXA DE 0.2

        System.out.println(conta.getSaldo());
    }
}
*/


/*

//CONSOLE

Exception in thread "main" SaldoInsuficienteException: Saldo: 200.0, Valor: 200.2
        at Conta.saca(Conta.java:25)
        at ContaCorrente.saca(ContaCorrente.java:13)
        at TesteSaca.main(TesteSaca.java:8)

*/


//COM TRATAMENTO


public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        //ja tinha um TRY CATCH
        conta.deposita(200.0);
        try {
        conta.saca(200.0); //TEM UMA TAXA DE 0.2
        } catch (SaldoInsuficienteException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(conta.getSaldo());
    }
}