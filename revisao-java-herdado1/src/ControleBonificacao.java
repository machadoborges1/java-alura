public class ControleBonificacao {

    private double soma;

    //isso � POLIMORFISMO
    // referencia generica
    public void registraBonificacao(Funcionario generico) { 
    	
    	//nesse caso 'generico' � do tipo Funcionario que n�o possui mais pois apagamos getBonificacao ja que se tornou abstract.
        //this.soma += generico.getBonificacao();
    	// aqui temos um problema grande ja que apagamos getBonifica��o() de Funcionario.
    	
    	//voutamos com getBonificacao pois agora o metodo � abstrato
    	this.soma += generico.getBonificacao();
    	
        //ao executar o codigo sera chamado o m�todo especifico
    }

    public double getSoma() {
        return soma;
    }

}