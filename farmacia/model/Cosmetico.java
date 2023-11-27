package farmacia.model;

public class Cosmetico extends Produto {

	private String fragrancia;
	
	public Cosmetico(int id, String nome, int tipo, double preco, String fragrancia) {
		super(id, nome, tipo, preco);
		this.fragrancia = fragrancia;
	}

	public String getFragancia() {
		return fragrancia;
	}

	public void setFragancia(String fragancia) {
		this.fragrancia = fragancia;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println(" fragrancia: " + fragrancia);
	}

}
