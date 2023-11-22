package poo5Heranca_Polimorfismo;

public abstract class Telefone {
private String tipo;
	
	abstract public void disca(String numero);//criação dos métodos abstratos
	abstract public void toca(int numToques);
	
	public Telefone(String tipo) { // criação do construtor
		this.tipo = tipo;
	}
	
	//métodos getters e setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
