package poo3;

public class PlanoConvenio {
	
	private String nome;
	private int cod ;
	private Double valor;
	
	public PlanoConvenio( int cod,String nome, Double valor) {
		this.nome = nome;
		this.cod = cod;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	
	
	

}
