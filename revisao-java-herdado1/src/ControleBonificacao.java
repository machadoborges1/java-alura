public class ControleBonificacao {

    private double soma;

    //isso é POLIMORFISMO
    // referencia generica
    public void registraBonificacao(Funcionario generico) { 
    	
    	//nesse caso 'generico' é do tipo Funcionario que não possui mais pois apagamos getBonificacao ja que se tornou abstract.
        //this.soma += generico.getBonificacao();
    	// aqui temos um problema grande ja que apagamos getBonificação() de Funcionario.
    	
    	//voutamos com getBonificacao pois agora o metodo é abstrato
    	this.soma += generico.getBonificacao();
    	
        //ao executar o codigo sera chamado o método especifico
    }

    public double getSoma() {
        return soma;
    }

}