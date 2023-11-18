package poo3;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PlanoConvenio plano1 = new PlanoConvenio(1, "Basic", 470.00);
		PlanoConvenio plano2 = new PlanoConvenio(2, "Plus", 800.00);
		PlanoConvenio plano3 = new PlanoConvenio(3, "Pro", 2500.00);

		String nome, profissao;
		int idade, codPlano;
		Double salario;

		System.out.println("Cadastro do Cliente 1 ");

		System.out.println("Nome: ");
		nome = sc.next();
		System.out.println("Idade: ");
		idade = sc.nextInt();
		System.out.println("Profissao: ");
		profissao = sc.next();

		Cliente cliente1 = new Cliente(nome, idade, profissao);

		System.out.println("Salario: ");
		salario = sc.nextDouble();
		cliente1.setSalario(salario);

		double creditoDisponivel = salario * 0.6;

		if (creditoDisponivel >= plano1.getValor()) {

			verificarPlanos(plano1, plano2, plano3, creditoDisponivel);

			System.out.println("Escolha o Plano: ");
			codPlano = sc.nextInt();

			switch (codPlano) {
			case 1:
				cliente1.setConvenio(plano1);
				break;
			case 2:
				cliente1.setConvenio(plano2);
				break;
			case 3:
				cliente1.setConvenio(plano3);
				break;
			default:
				System.out.println("Opcao invalida");
			}
			
		} else {
			System.out.println("Nenhum Plano Disponivel");
		}
		cliente1.visualizar();
		

		System.out.println("Cadastro do Cliente 2 ");

		System.out.println("Nome: ");
		nome = sc.next();
		System.out.println("Idade: ");
		idade = sc.nextInt();
		System.out.println("Profissao: ");
		profissao = sc.next();

		Cliente cliente2 = new Cliente(nome, idade, profissao);

		System.out.println("Salario: ");
		salario = sc.nextDouble();
		cliente2.setSalario(salario);

		creditoDisponivel = salario * 0.6;

		if (creditoDisponivel >= plano1.getValor()) {

			verificarPlanos(plano1, plano2, plano3, creditoDisponivel);

			System.out.println("\nEscolha o Plano: ");
			codPlano = sc.nextInt();

			switch (codPlano) {
			case 1:
				cliente2.setConvenio(plano1);
				break;
			case 2:
				cliente2.setConvenio(plano2);
				break;
			case 3:
				cliente2.setConvenio(plano3);
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} else {
			System.out.println("Nenhum Plano Disponivel");
		}

		

	}

	public static void verificarPlanos(PlanoConvenio plano1, PlanoConvenio plano2, PlanoConvenio plano3,
			Double creditoDisponivel) {

		if (creditoDisponivel >= plano3.getValor()) {
			System.out.println("Plano disponiveis: ");
			System.out.println(plano1.getCod() + " " + plano1.getNome() + " - R$ " + plano1.getValor());
			System.out.println(plano2.getCod() + " " + plano2.getNome() + " - R$ " + plano2.getValor());
			System.out.println(plano3.getCod() + " " + plano3.getNome() + " - R$ " + plano3.getValor());
		} else if (creditoDisponivel >= plano2.getValor()) {
			System.out.println("Plano disponiveis: ");
			System.out.println(plano1.getCod() + " " + plano1.getNome() + " - R$ " + plano1.getValor());
			System.out.println(plano2.getCod() + " " + plano2.getNome() + " - R$ " + plano2.getValor());

		} else if (creditoDisponivel >= plano1.getValor()) {
			System.out.println("Plano disponiveis: ");
			System.out.println(plano1.getCod() + " " + plano1.getNome() + " - R$ " + plano1.getValor());
		} else {
			System.out.println("Nenhum Plano Disponivel");
		}
	}

}
