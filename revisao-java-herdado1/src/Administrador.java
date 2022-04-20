
//public class Administrador extends FuncionarioAutenticavel {
// como N�O EXISTE HERAN�A MULTIPLA ----
// parou de ser para colocar o cliente como FuncionarioAUTENTICAVEL


public class Administrador extends Funcionario implements FuncionarioAutenticavel{
	
	//private int senha;
	
	
	
	
	private AutenticacaoUtil autenticador;

    public Administrador() { //com isso elimina a necessidade de 'senha'
        this.autenticador = new AutenticacaoUtil();
    }
    //Assim, quando chamar a senha, quem guardar� esta informa��o n�o ser� diretamente a pr�pria classe, e sim a AutenticacaoUtil
    
    
    
    
    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
	
}