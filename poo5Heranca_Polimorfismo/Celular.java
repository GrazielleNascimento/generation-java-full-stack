package poo5Heranca_Polimorfismo;

public class Celular extends Telefone{
	
	public Celular() {
		super("Telefone Celular");
	}

	@Override //é uma anotação que cria a relação de polimorfismo com o método criado na superclasse
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("\nTictac TicTac");
			break;
		case 2:
			System.out.println("\nPrimmmmmmm Primmmmmmmmm");
			break;
			default:
				System.out.println("\nNãnãnãnã Batman");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO número: "+numero+" é um celular...");
	}
}