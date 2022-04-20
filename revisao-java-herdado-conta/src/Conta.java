public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    // construtor adicionado por causa da ContaCorrente
//    public Conta() {
//
//    }
    //O super sempre fará com que o Java busque o construtor padrão, mas podemos utilizá-lo para chamar um construtor específico.
    //Apagaremos o construtor Conta() que acabamos de criar.

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);
    	//{
        // this.saldo = this.saldo + valor;
    	// foi feito apenas para ilustrar a implementaçao abstract
    	//}


    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //Este código funciona por causa do polimorfismo, temos a referência do tipo genérico
    public boolean transfere(double valor, Conta destino) {   // Exemplo.transfere(exemploValor, ExemploDestino)
    //Recebemos como parâmetro a Conta, ou seja, o tipo genérico, não sabemos ainda se é uma conta corrente, ou conta poupança
        if(this.saca(valor)) {  // this aponta para o objeto Exemplo
        						// chama o metodo especifico e nosso especifico chama o genérico.
                destino.deposita(valor);
                return true;
        } else {
                return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}