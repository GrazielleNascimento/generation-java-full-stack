package farmacia.model;

public class Medicamento extends Produto {

	public Medicamento(int id, String nome, int tipo, double preco, String generico) {
		super(id, nome, tipo, preco);
		this.generico = generico;
	}

	private String generico;

	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("generico: " + generico);
	}

}

