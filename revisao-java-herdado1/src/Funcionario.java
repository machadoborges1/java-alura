//Base class, Classe m�e, super class
//public class Funcionario {  // Foi adicionado o Abstract
public abstract class Funcionario { // agora Funcionario � abstrato e n�o concreto.
									// ou seja n�o pode fazer um 'new Funcionario()', pois isso cria um objeto.
									// A palavra abstract est� sempre relacionada com heran�a.
	
    private String nome;
    private String cpf;
    private double salario;
    //protected double salario; // dessa forma fica publico para os filhos

    
    //public Funcionario() {}   // Existe esse construtor padr�o criado por baixo dos panos
    
    
    // pois agora n�o tem mais bonifica��o comum.
//    public double getBonificacao() {
//        return this.salario * 0.1;
//    }
    
    
    //dessa forma vamos criar METODO ABSTRACT
    //abstract no metodo significa: metodo sem corpo\ n�o foi implementado
    public abstract double getBonificacao();
    //agora os FILHOS s�o OBRIGADO a implementar o metodo getBonificacao

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}