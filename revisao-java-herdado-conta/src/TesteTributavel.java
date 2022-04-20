
public class TesteTributavel {

	public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(cc); //0.01%
        calc.registra(seguro); //42

        System.out.print(calc.getTotalImposto()); //43

        }
}
