
public class TesteConexao {

	public static void main(String[] args) {
//	    Conexao con = null;
//	    try {
//	        con = new Conexao();
//	        con.leDados();
//	    } catch(IllegalStateException ex) {
//	        System.out.println("Deu erro na conexao");
//	    } finally { // o compilador garante que sempre sera chamado.
//	        con.fecha();
//	    }
		
		
		//maneira mais recente de fazer
		
		
		// O bloco finally é tipicamente utilizado para fechar um recurso como conexão ou transação.
		
		try (Conexao conexao = new Conexao()) { // dessa forma exigiu usar AutoClouseable na class Conexao.
												//The resource type Conexao does not implement java.lang.AutoCloseable
	        conexao.leDados();
	    } catch(IllegalStateException ex) {
	        System.out.println("Deu erro na conexao");
	    }
	}
}


//O que está garantido quando usamos o try-with-resources?
	//O bloco finally é criado automaticamente.
	//O recurso precisa implementar o método close().
		//automaticamente é criado um bloco finally. Nele é chamado o método close() do recurso.