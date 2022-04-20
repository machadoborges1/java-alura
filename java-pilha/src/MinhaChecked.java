
//Abaixo o erro stackOverFlow e de onde ele vem
//error é mais visualizado por desenvolvedores de maquina virtual.

// Já a segunda categoria de erros possui StackOverflowError, 
//que herda de VirtualMachineError, que herda de Error, 
//que herda de Throwable, formando a segunda categoria.



//checado pelo compilador
//MinhaChecked -> Exception -> Throwable
//CHECKED
public class MinhaChecked extends Exception{  //aqui a classe mãe é uma acima

	public MinhaChecked(String msg) {
    	super(msg);
    	
	}
}

// ao compilar THROWS precisa estar explicito no código após a chamada do método
// private static void metodo3() throws MinhaChecked { }