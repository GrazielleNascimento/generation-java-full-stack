package farmacia.model;

public abstract class Produto {

	private int id;
	private String nome;
	private int tipo;
	private double preco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void visualizar() {
		System.out.println("O Produto: " + id + "nome: " + nome + "tipo: " + tipo + "preco: " + preco);

	}

}
