
public class SistemaInterno {

        private int senha = 2222;

        public void autentica(FuncionarioAutenticavel generico) {
            boolean autenticou = generico.autentica(this.senha);   //FuncionarioAutenticavel possui o metodo autentica
            if(autenticou) {
                System.out.println("Pode entrar no sistema!");
            } else {
                System.out.println("Não pode entrar no sistema!");
            }
        }
}