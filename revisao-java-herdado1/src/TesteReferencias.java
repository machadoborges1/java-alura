
public class TesteReferencias {

	public static void main(String[] args) {
		
		
		
		
		Funcionario exemplo = new Gerente();
		
		// declarar uma variavel de forma mais gen�rica, apenas do lado esquerdo
		// o Objeto continua sendo GERENTE // A referencia � FUNCIONARIO
		
		exemplo.setNome("humberto");
		String neme = exemplo.getNome();
		System.out.println(neme);
		
		//exemplo.autentica(2222);
		//exemplo n�o funciona porque � do tipo funcionario e n�o autentica, apenas gerente.
		//lembrando que autentica s� recebe GERENTE   //  public boolean autentica(int senha){this.senha}
		
		
		//Funcionario comum = new Funcionario();
		//Pois agora a classe Funcionario � abstrato.
		
		
		Gerente exemplo1 = new Gerente();
        exemplo1.setNome("Marcos");
        exemplo1.setSalario(5000.0);

        Funcionario ev = new EditorVideo();
        ev.setSalario(2500.0);

        Funcionario d = new Designer();
        d.setSalario(2000.0);
        
        
        //Isso � POLIMORFISMO
        ControleBonificacao controle = new ControleBonificacao();
        controle.registraBonificacao(exemplo); // metodo registra recebe uma referencia do tipo Funcionario.
        controle.registraBonificacao(exemplo1); // funciona porque gerente tamb�m � um funcionario
        controle.registraBonificacao(ev);
        controle.registraBonificacao(d);

        System.out.println(controle.getSoma());

	}

}
