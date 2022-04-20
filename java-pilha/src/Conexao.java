
//public class Conexao {
//
//    Conexao con = null;
//    try {
//        con = new Conexao();
//        con.leDados();
//    } catch(IllegalStateException ex) {
//        System.out.println("Deu erro na conexao");
//    } finally {
//        System.out.println("finally");
//        if(con != null) {
//            con.fecha();
//        }
//    }
//}

public class Conexao implements AutoCloseable{  //esse métodp nativo, fecha a conexão sem a gente ter que implementar.
    public Conexao() {
        System.out.println("Abrindo conexao");
        throw new IllegalStateException();
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    @Override
    public void close() {
        System.out.println("Fechando conexao");
    }
}