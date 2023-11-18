package poo3;

public class Cliente {
	
	private String nome;
	private int idade;
	private String profissao;
	private double salario;
	private PlanoConvenio convenio;
	
	public Cliente(String nome, int idade, String profissao) {
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	public PlanoConvenio getConvenio() {
		return convenio;
	}

	public void setConvenio(PlanoConvenio convenio) {
		this.convenio = convenio;
	}

	public void visualizar() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n O cliente " + nome 
				+ ",\n tem a idade de " + idade + " anos "
				+ "\n sua profissao é " + profissao 
				+ "\n seu salario é de " + salario);
			
		if(convenio != null) {
			sb.append(",\n com o plano de convenio: " + convenio.getNome() 
				+ "\n com o valor de " + convenio.getValor());
		}  else{
			sb.append("\n então não possui convênio " );
		}
		
		System.out.println(sb.toString());
		
			
	}
	
	
	
}
