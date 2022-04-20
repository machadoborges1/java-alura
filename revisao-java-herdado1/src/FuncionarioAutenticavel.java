
// interface é uma classe abstraca com todos os metodos abstratos.
// será eliminado tudo que é concreto e deixaremos aoenas assinaturas.

//public abstract class FuncionarioAutenticavel {    // substituimos class por interface.


//interface é um tipo
// INterface é como um contrato, nesse caso chamaramos de Contrato FuncionarioAutenticavel.
	//  nesse contrato tem a obrigaçãode implementar:
		//  setSenha
		//  autentica
public abstract interface FuncionarioAutenticavel {

    //private int senha;
	//isso é concreto
		

    public abstract void setSenha(int senha);
    
    
//    {
//        this.senha = senha;
//    }
    //implementação também é concreto
    
    
    public abstract boolean autentica(int senha);
    
//    {
//        if(this.senha == senha) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    
    
}