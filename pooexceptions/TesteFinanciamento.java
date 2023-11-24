package pooexceptions;

public class TesteFinanciamento {

	public static void main(String[] args) {

		double valorTotal = 1000.0;
		double entrada = 300.0;
		int parcelas = 10;

		try {

			Financiamento financiamento = new Financiamento(valorTotal, entrada, parcelas);

			System.out.println(financiamento.prestacao());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
