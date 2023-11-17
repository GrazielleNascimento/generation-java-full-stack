package poo2;
import java.text.NumberFormat;

public class Empregado {

	
	//criação dos atributos
	
	private String nome;
	private double salario;
	
	//criação do construtor
	public Empregado(String nome, double salario) {
		
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();//vou pegar a moeda do pais
		nf.setMinimumFractionDigits(2);//vou formatar as casas decimais
		String formatoMoeda = nf.format(salario);//1.000
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome+"\t\t"+" Salário: "+this.formatarMoeda());
	}
	
	
}
