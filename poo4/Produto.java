package poo4;

import java.util.Date;
import java.util.List;



public class Produto {
	
	private String nome;
	private double preco;
	private int qtdEstoque;
	private String plataforma;
	private Date dataLancamento;
	private String descricao;
	private String desenvolvedora;
	private String classificacaoEtaria;
	private String genero;
	private List <String> idiomasDisponiveis;
	private double avaliacaoUsuarios;
	
	
	public Produto(String nome, double preco, int qtdEstoque, String plataforma, Date dataLancamento, String descricao,
			String desenvolvedora, String classificacaoEtaria, String genero, List<String> idiomasDisponiveis,
			double avaliacaoUsuarios) {
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.plataforma = plataforma;
		this.dataLancamento = dataLancamento;
		this.descricao = descricao;
		this.desenvolvedora = desenvolvedora;
		this.classificacaoEtaria = classificacaoEtaria;
		this.genero = genero;
		this.idiomasDisponiveis = idiomasDisponiveis;
		this.avaliacaoUsuarios = avaliacaoUsuarios;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQtdEstoque() {
		return qtdEstoque;
	}


	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}


	public Date getDataLancamento() {
		return dataLancamento;
	}


	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getDesenvolvedora() {
		return desenvolvedora;
	}


	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}


	public String getClassificacaoEtaria() {
		return classificacaoEtaria;
	}


	public void setClassificacaoEtaria(String classificacaoEtaria) {
		this.classificacaoEtaria = classificacaoEtaria;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public List<String> getIdiomasDisponiveis() {
		return idiomasDisponiveis;
	}


	public void setIdiomasDisponiveis(List<String> idiomasDisponiveis) {
		this.idiomasDisponiveis = idiomasDisponiveis;
	}


	public double getAvaliacaoUsuarios() {
		return avaliacaoUsuarios;
	}


	public void setAvaliacaoUsuarios(double avaliacaoUsuarios) {
		this.avaliacaoUsuarios = avaliacaoUsuarios;
	}
	
	
	

}
