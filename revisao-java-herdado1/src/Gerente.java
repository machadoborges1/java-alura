//Gerente é um funcionário // herda a classe funcionario // extend a classe funcionario
//classe filha
public class Gerente extends Funcionario implements FuncionarioAutenticavel{
//EXTENDS é usado para puxar tudo do funcionário para o gerente.

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
    
	
	
	
    // foi feita aqui uma REESCRITA, onde se tem o mesmos visibilidade, mesmo retorno, mesmo nome e os mesmos parâmetros da classe mãe.
    // na reescria se usa a MESMA ASSINATURA
    // essa é a maneira de manter o codigo private na Classe funcionario
    public double getBonificacao() {
        //return super.getSalario() + super.getBonificacao();   // agora o gerente recebe salario fixo na bonificação
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
	
	
	
	
	
    
    // essa é a maneira de usar "'protected' double salario", não classe Funcionário.
    //public double getBonificacao(){
    	//return super.salario; // SUPER para dizer que vem da classe mãe
    //}
}

//Gerente exemplo = new Gerente();
//exemplo.getNome();  // 'Humberto'

