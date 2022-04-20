
public class TesteReferencias {

	public static void main(String[] args) {
		
		
		
		
		Funcionario exemplo = new Gerente();
		
		// declarar uma variavel de forma mais genérica, apenas do lado esquerdo
		// o Objeto continua sendo GERENTE // A referencia é FUNCIONARIO
		
		exemplo.setNome("humberto");
		String neme = exemplo.getNome();
		System.out.println(neme);
		
		//exemplo.autentica(2222);
		//exemplo não funciona porque é do tipo funcionario e não autentica, apenas gerente.
		//lembrando que autentica só recebe GERENTE   //  public boolean autentica(int senha){this.senha}
		
		
		//Funcionario comum = new Funcionario();
		//Pois agora a classe Funcionario é abstrato.
		
		
		Gerente exemplo1 = new Gerente();
        exemplo1.setNome("Marcos");
        exemplo1.setSalario(5000.0);

        Funcionario ev = new EditorVideo();
        ev.setSalario(2500.0);

        Funcionario d = new Designer();
        d.setSalario(2000.0);
        
        
        //Isso é POLIMORFISMO
        ControleBonificacao controle = new ControleBonificacao();
        controle.registraBonificacao(exemplo); // metodo registra recebe uma referencia do tipo Funcionario.
        controle.registraBonificacao(exemplo1); // funciona porque gerente também é um funcionario
        controle.registraBonificacao(ev);
        controle.registraBonificacao(d);

        System.out.println(controle.getSoma());

	}

}
