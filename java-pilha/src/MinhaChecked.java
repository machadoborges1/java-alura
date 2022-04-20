
//Abaixo o erro stackOverFlow e de onde ele vem
//error � mais visualizado por desenvolvedores de maquina virtual.

// J� a segunda categoria de erros possui StackOverflowError, 
//que herda de VirtualMachineError, que herda de Error, 
//que herda de Throwable, formando a segunda categoria.



//checado pelo compilador
//MinhaChecked -> Exception -> Throwable
//CHECKED
public class MinhaChecked extends Exception{  //aqui a classe m�e � uma acima

	public MinhaChecked(String msg) {
    	super(msg);
    	
	}
}

// ao compilar THROWS precisa estar explicito no c�digo ap�s a chamada do m�todo
// private static void metodo3() throws MinhaChecked { }