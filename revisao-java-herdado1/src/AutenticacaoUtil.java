
public class AutenticacaoUtil {
	
	// Manteremos somente as assinatura, e eliminaremos a l�gica dos m�todos. (Gerente, Cliente, Administrador)

        private int senha;

        public void setSenha(int senha) {
            this.senha = senha;
        }

        public boolean autentica(int senha) {
            if(this.senha == senha) {
                return true;
            } else {
                return false;
            }
        }
}