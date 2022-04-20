
public class TesteSistema {

        public static void main(String[] args) {
                Gerente generico = new Gerente();
                generico.setSenha(2222);

                SistemaInterno si = new SistemaInterno();
                si.autentica(generico);

        }

}