
public class ContaCorrente extends Conta implements Tributavel{
// ao escrever isso mostra que não compila, pois os CONSTRUTORES de Conta não são herdados.
// os contrutores permanecem somente à sua propria classe
	
//// EXEMPLO DO CONSTRUTOR
//
//    public Conta(int agencia, int numero){
//        Conta.total++;
//        System.out.println("O total de contas é " + Conta.total);
//        this.agencia = agencia;
//        this.numero = numero;
//        this.saldo = 100;
//        System.out.println("Estou criando uma conta " + this.numero);
//    }
//
////
	
	// Por isso escrever o próprio construtor.
	


    public ContaCorrente(int agencia, int numero) { //parâmetros para o construtor
    	
    	super(agencia, numero); //por ser especifico... informações de agencia e numero
    	//O super() significa que subimos na hierarquia, para chamar um método ou atributo da classe mãe. 
    	//Mas existe um construtor padrão na classe mãe, neste caso? não, porque criamos um construtor específico.
    	
    	//Adicionaremos o construtor Conta() na classe Conta:  //  assim as mensagens de erro somem
    	
    	//definiremos parâmetros para o construtor:
    	//public ContaCorrente(int agencia, int numero) {super();}
    	
    	//Na chamada do construtor específico, passaremos as informações de agencia e numero:
    	
    	//Ou seja, podemos utilizar o super para chamar um construtor específico, passando os parâmetros específicos para ele.
    }
    
    @Override  // isso é uma anotação.
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