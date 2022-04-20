//Gerente � um funcion�rio // herda a classe funcionario // extend a classe funcionario
//classe filha
public class Gerente extends Funcionario implements FuncionarioAutenticavel{
//EXTENDS � usado para puxar tudo do funcion�rio para o gerente.

	//Gerente eh um FuncionarioAutenticavel, Gerente herda da classe FuncionarioAutenticavel

	
	//private int senha;  //por causa da AutenticacaoUtil
	
	private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();  //toda vez que criar um gerente sera criado um autenticador
    }
	
	//passado para FuncionarioAutenticavel
//    private int senha;
//
//    public void setSenha(int senha) {
//        this.senha = senha;
//    }
//
//    public boolean autentica(int senha) {
//        if (this.senha == senha) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    
	
	
	
    // foi feita aqui uma REESCRITA, onde se tem o mesmos visibilidade, mesmo retorno, mesmo nome e os mesmos par�metros da classe m�e.
    // na reescria se usa a MESMA ASSINATURA
    // essa � a maneira de manter o codigo private na Classe funcionario
    public double getBonificacao() {
        //return super.getSalario() + super.getBonificacao();   // agora o gerente recebe salario fixo na bonifica��o
    	return super.getSalario();
    	
    	
    	
    	
    	
    	
    }

	@Override
	public void setSenha(int senha) { // a senha sera guardada no AutenticadorUtil
		//this.senha = senha;
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
//		if(this.senha == senha) {
//			return true;
//		} else {
//			return false;
//		}
		return this.autenticador.autentica(senha);
	}
	
	
	
	
	
    
    // essa � a maneira de usar "'protected' double salario", n�o classe Funcion�rio.
    //public double getBonificacao(){
    	//return super.salario; // SUPER para dizer que vem da classe m�e
    //}
}

//Gerente exemplo = new Gerente();
//exemplo.getNome();  // 'Humberto'

