package farmacia.model;


public class Medicamento extends Produto {

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
