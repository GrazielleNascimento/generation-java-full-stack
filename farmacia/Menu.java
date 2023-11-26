package farmacia;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import farmacia.controller.ProdutoController;
import farmacia.model.Cosmetico;
import farmacia.model.Medicamento;
import farmacia.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ProdutoController produtos = new ProdutoController();

		Medicamento medicamento = new Medicamento(produtos.gerarId(), "Benegrip", 1, 30.0, "Nogrip");
		produtos.criarProduto(medicamento);

		Cosmetico cosmetico = new Cosmetico(produtos.gerarId(), "Hidratante", 2, 8.0, "floral");
		produtos.criarProduto(cosmetico);

		int opcao;
		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND

					+ "***********************************************************************");
			System.out.println("                                                              ");
			System.out.println("                                                              ");
			System.out.println("                     Baby Farmácia                           ");
			System.out.println("                                                              ");
			System.out.println(" ************************************************************ ");
			System.out.println("                                                              ");
			System.out.println("                   1 - Cadastrar Produto                      ");
			System.out.println("                   2 - Listar todos os Produtos               ");
			System.out.println("                   3 - Consultar Produto por ID               ");
			System.out.println("                   4 - Atualizar Produto                      ");
			System.out.println("                   5 - Deletar Produto                        ");
			System.out.println("                   6 - Sair                                   ");
			System.out.println("                                                              ");
			System.out.println(" ************************************************************ ");
			System.out.println("                   Entre com a opção desejada:                ");
			System.out.println("                                                              " + Cores.TEXT_RESET);

			// trata erros de entrada da opcao
			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				sc.nextLine();
				opcao = 0;
			}
			// para sair do programa
			if (opcao == 6) {
				System.out.println(
						Cores.TEXT_WHITE_BOLD + "\nSua Saúde, Nossa Prioridade: A Farmácia que Cuida de Você!");
				sobre();
				sc.close();
				System.exit(0);
			}
			String nome, generico, fragrancia;
			int tipo;
			double preco;

		
		}
	}

	private static void sobre() {
		System.out.println("     ********************** **********************     \n");
		System.out.println("                      Criado por                        ");
		System.out.println("                                                        ");
		System.out.println("                    Grazielle Nascimento                ");
		System.out.println("         https://github.com/GrazielleNascimento         ");
		System.out.println("                                                        ");
		System.out.println("     ********************** **********************      ");

	}

	public static void keyPress() {
		try {
			System.out.println("\nPressione Enter para Continuar");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter");
		}
	}

}
