package farmacia;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import farmacia.controller.ProdutoController;
import farmacia.model.Cosmetico;
import farmacia.model.Medicamento;
import farmacia.model.Produto;
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

					+ "**************************************************************");
			System.out.println("                                                              ");
			System.out.println("                                                              ");
			System.out.println("                     Baby Farmácia                            ");
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
				System.out.print(Cores.TEXT_PURPLE_BOLD +  Cores.ANSI_BLACK_BACKGROUND + "      ********************** **********************       ");
				System.out.println(
						
						Cores.TEXT_PURPLE_BOLD +  Cores.ANSI_BLACK_BACKGROUND + "\nSua Saúde, Nossa Prioridade: A Farmácia que Cuida de Você!");
				sobre();
				sc.close();
				System.exit(0);
			}
			String nome, generico, fragrancia;
			int id, tipo;
			double preco;

			switch (opcao) {
			case 1: {

				System.out.println("Digite o tipo do Produto\n1 - Medicamento\n2 - Cosmético ");
				System.out.print("tipo: ");
				tipo = sc.nextInt();

				switch (tipo) {
				case 1:
					System.out.print("Digite o nome do Medicamento: ");
					sc.skip("\\R");
					nome = sc.nextLine();
					System.out.print("Digite o preço do " + nome + ":");
					preco = sc.nextFloat();
					System.out.print("Digite o nome do Genérico desse Medicamento: ");
					sc.skip("\\R");
					generico = sc.nextLine();
					produtos.criarProduto(new Medicamento(produtos.gerarId(), nome, tipo, preco, generico));
					break;
				case 2:
					System.out.print("Digite o nome do Cosmético: ");
					sc.skip("\\R");
					nome = sc.nextLine();
					System.out.print("Digite o preço do " + nome + ":");
					preco = sc.nextFloat();
					System.out.print("Digite a fragrância do Cosmético: ");
					sc.skip("\\R");
					fragrancia = sc.nextLine();
					produtos.criarProduto(new Cosmetico(produtos.gerarId(), nome, tipo, preco, fragrancia));
					break;
				}
				keyPress();
				break;
			}
			case 2: {
				System.out.println("******************** Lista de Produtos ********************\n");
				produtos.listarProdutos();
				keyPress();
				break;
			}
			case 3: {
				System.out.print("Digite o ID do Produto: ");
				id = sc.nextInt();
				produtos.consultarPorId(id);
				keyPress();
				break;
			}

			case 4: {
				System.out.println("Digite o ID do Produto: ");
				id = sc.nextInt();

				Optional<Produto> produto = produtos.buscarNaCollection(id);

				if (produto.isPresent()) {
					tipo = produto.get().getTipo();
					System.out.println("Digite o novo nome do Produto: ");
					sc.skip("\\R");
					nome = sc.nextLine();
					System.out.println("Digite o novo preço do Produto: ");
					preco = sc.nextFloat();

					switch (tipo) {
					case 1:
						System.out.println("Digite o novo nome do Genérico do Medicamento: ");
						sc.skip("\\R");
						generico = sc.nextLine();
						produtos.atualizarProduto(new Medicamento(id, nome, tipo, preco, generico));
						break;
					case 2:
						System.out.println("Digite a nova fragrância: ");
						sc.skip("\\R");
						fragrancia = sc.nextLine();
						produtos.atualizarProduto(new Cosmetico(id, nome, tipo, preco, fragrancia));
						break;
					default:
						System.out.println("Tipo de Produto inválido!");

					}
				} else {
					System.out.println("Produto não encontrado!");
					keyPress();
					break;
				}

			}
			case 5: {
				System.out.println("Digite o ID do Produto: ");
				id = sc.nextInt();
				produtos.deletarProduto(id);
				keyPress();
			}
			}
		}

	}

	private static void sobre() {
		System.out.println("     ********************** **********************        ");
		System.out.println("                      Criado por                          ");
		System.out.println("                                                          ");
		System.out.println("                    Grazielle Nascimento                  ");
		System.out.println("         https://github.com/GrazielleNascimento           ");
		System.out.println("                                                          ");
		System.out.println("     ********************** **********************        ");

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
+