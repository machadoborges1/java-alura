
public class CalculadorImposto {
	
	private double totalImposto;

    public void registra(Tributavel qualquer) {

        double valor = qualquer.getValorImposto();
        this.totalImposto += valor;
    }
    
    public double getTotalImposto() {
    	return totalImposto;
    }
}
