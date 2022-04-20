package revisao;

//primeira Classe, primeiro tipo:
//essas contas tornar�o OBJETO\INSTACIA:
//ou seja, voce instancia a CLASSE e se torna um objeto\instancia
public class Conta{

	//maioria dos atributos ser�o privados
    private double saldo; // saldo, agencia, numero � um atributo
    // private --- nem lido e nem modificado a n�o ser pela pr�pria classe.
    int agencia; //valor padr�o == 0
    int numero; // isso � um atributo
    //String exemplo; //valor padr�o == nil
    //String titular; //String n�o � uma palavra chave do java
    Cliente titular; //aponta para o objeto Cliente
    //Cliente titular = new Cliente(); // Dessa forma n�o precisa ficar criando o cliente.
    private static int totalContas; //esse STATIC torna esse atributo da Classe. Ou seja, n�o vai ter um 'valor' para cada objeto criado.
    	//n�o � mais do objeto(this.totalContas), agora � da classe(Conta.totalContas)
    	//totalContas � compartilhado entre as intancias.
    //static int numeroConta;  //todo objeto conta tem acesso a um unico local de numeroConta.
    //nesse caso tamb�m quando criarmos o m�todo tamb�m temos que colocar STATIC para dizer que � da classe
    
    
    
    //CONSTRUTOR
    //quando voce n�o da valor a um construtor o java increve um padr�o. Exemplo � baixo
    //public ClassExemplo(){}
    //uma rotina de inicializa��o.
    //se inicializa com a palavra NEW 'ClassExemplo exemplo = new ClassExemplo();'
    //pode-se passar parametros.'public ClassExemplo(void parametro1, void parametro2){};'
    
    
    
    
    
    // isso � um M�TODO
    public void deposita(double valor){
        this.saldo += valor; //'this'  � uma palavra chave do java que faz referencia ao atributo do objeto que esta sendo referenciado.
    }
        
    // quando boolean deve-se ter return
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false; //else � opcional.
        }
    }
    
    // m�todo com referencia.
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

//VARI�VEIS de objetos em java armazena s� ENDERE�O DE MEM�RIA (ou seja, s�o uma REFER�NCIA)e n�o o objeto.


