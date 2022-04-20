//Base class, Classe mãe, super class
//public class Funcionario {  // Foi adicionado o Abstract
public abstract class Funcionario { // agora Funcionario é abstrato e não concreto.
									// ou seja não pode fazer um 'new Funcionario()', pois isso cria um objeto.
									// A palavra abstract está sempre relacionada com herança.
	
    private String nome;
    private String cpf;
    private double salario;
    //protected double salario; // dessa forma fica publico para os filhos

    
    //public Funcionario() {}   // Existe esse construtor padrão criado por baixo dos panos
    
    
    // pois agora não tem mais bonificação comum.
//    public double getBonificacao() {
//        return this.salario * 0.1;
//    }
    
    
    //dessa forma vamos criar METODO ABSTRACT
    //abstract no metodo significa: metodo sem corpo\ não foi implementado
    public abstract double getBonificacao();
    //agora os FILHOS são OBRIGADO a implementar o metodo getBonificacao

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