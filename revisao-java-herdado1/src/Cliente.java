
// public class Cliente extends FuncionarioAutenticavel {

// no mundo java ao assinar um contrato\ intercafe, não se usa extends e sim implements
public class Cliente implements FuncionarioAutenticavel {
	
	private AutenticacaoUtil util;

    public Cliente() {
        this.util = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }


}
