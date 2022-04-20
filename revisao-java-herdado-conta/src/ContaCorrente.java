
public class ContaCorrente extends Conta implements Tributavel{
// ao escrever isso mostra que n�o compila, pois os CONSTRUTORES de Conta n�o s�o herdados.
// os contrutores permanecem somente � sua propria classe
	
//// EXEMPLO DO CONSTRUTOR
//
//    public Conta(int agencia, int numero){
//        Conta.total++;
//        System.out.println("O total de contas � " + Conta.total);
//        this.agencia = agencia;
//        this.numero = numero;
//        this.saldo = 100;
//        System.out.println("Estou criando uma conta " + this.numero);
//    }
//
////
	
	// Por isso escrever o pr�prio construtor.
	


    public ContaCorrente(int agencia, int numero) { //par�metros para o construtor
    	
    	super(agencia, numero); //por ser especifico... informa��es de agencia e numero
    	//O super() significa que subimos na hierarquia, para chamar um m�todo ou atributo da classe m�e. 
    	//Mas existe um construtor padr�o na classe m�e, neste caso? n�o, porque criamos um construtor espec�fico.
    	
    	//Adicionaremos o construtor Conta() na classe Conta:  //  assim as mensagens de erro somem
    	
    	//definiremos par�metros para o construtor:
    	//public ContaCorrente(int agencia, int numero) {super();}
    	
    	//Na chamada do construtor espec�fico, passaremos as informa��es de agencia e numero:
    	
    	//Ou seja, podemos utilizar o super para chamar um construtor espec�fico, passando os par�metros espec�ficos para ele.
    }
    
    @Override  // isso � uma anota��o.
    // foi feita um sobrescrita. \ sobrescrever \ substituir
    // assinatura deve ser igual. \\ public boolean saca(double valor)
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar); //redefini de 'valor' para 'valorASacar'
    }

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}