
// interface � uma classe abstraca com todos os metodos abstratos.
// ser� eliminado tudo que � concreto e deixaremos aoenas assinaturas.

//public abstract class FuncionarioAutenticavel {    // substituimos class por interface.


//interface � um tipo
// INterface � como um contrato, nesse caso chamaramos de Contrato FuncionarioAutenticavel.
	//  nesse contrato tem a obriga��ode implementar:
		//  setSenha
		//  autentica
public abstract interface FuncionarioAutenticavel {

    //private int senha;
	//isso � concreto
		

    public abstract void setSenha(int senha);
    
    
//    {
//        this.senha = senha;
//    }
    //implementa��o tamb�m � concreto
    
    
    public abstract boolean autentica(int senha);
    
//    {
//        if(this.senha == senha) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    
    
}