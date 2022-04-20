
public class ContaPoupanca extends Conta {

	// lembrando que construtores não são herdados.
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
    
    
}