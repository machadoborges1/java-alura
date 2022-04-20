package revisao;

//primeira Classe, primeiro tipo:
//essas contas tornarão OBJETO\INSTACIA:
//ou seja, voce instancia a CLASSE e se torna um objeto\instancia
public class Conta{

	//maioria dos atributos serão privados
    private double saldo; // saldo, agencia, numero é um atributo
    // private --- nem lido e nem modificado a não ser pela própria classe.
    int agencia; //valor padrão == 0
    int numero; // isso é um atributo
    //String exemplo; //valor padrão == nil
    //String titular; //String não é uma palavra chave do java
    Cliente titular; //aponta para o objeto Cliente
    //Cliente titular = new Cliente(); // Dessa forma não precisa ficar criando o cliente.
    private static int totalContas; //esse STATIC torna esse atributo da Classe. Ou seja, não vai ter um 'valor' para cada objeto criado.
    	//não é mais do objeto(this.totalContas), agora é da classe(Conta.totalContas)
    	//totalContas é compartilhado entre as intancias.
    //static int numeroConta;  //todo objeto conta tem acesso a um unico local de numeroConta.
    //nesse caso também quando criarmos o método também temos que colocar STATIC para dizer que é da classe
    
    
    
    //CONSTRUTOR
    //quando voce não da valor a um construtor o java increve um padrão. Exemplo à baixo
    //public ClassExemplo(){}
    //uma rotina de inicialização.
    //se inicializa com a palavra NEW 'ClassExemplo exemplo = new ClassExemplo();'
    //pode-se passar parametros.'public ClassExemplo(void parametro1, void parametro2){};'
    
    
    
    
    
    // isso é um MÉTODO
    public void deposita(double valor){
        this.saldo += valor; //'this'  é uma palavra chave do java que faz referencia ao atributo do objeto que esta sendo referenciado.
    }
        
    // quando boolean deve-se ter return
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false; //else é opcional.
        }
    }
    
    // método com referencia.
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);    
            return true;
        }
        return false;
    }
    
    //Getter
    public double getSaldo(){
        return this.saldo;
    }

    //Setter
    public void setNumero(int numero){  //retorna vazio
        this.numero = numero;
    }
}

//VARIÁVEIS de objetos em java armazena só ENDEREÇO DE MEMÓRIA (ou seja, são uma REFERÊNCIA)e não o objeto.


