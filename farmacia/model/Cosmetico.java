package farmacia.model;

public class Cosmetico extends Produto {
	private String fragrancia;

	public String getFragancia() {
		return fragrancia;
	}

	public void setFragancia(String fragancia) {
		this.fragrancia = fragancia;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("fragrancia: " + fragrancia);
	}

}
