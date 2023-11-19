package poo4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteProduto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Produto> jogos = new ArrayList<Produto>();
//nome, preço, qtdEstoque, plataforma, data de lançamento, descricao, desenvolvedora, faixa Etaria,genero lista de idiomas
		jogos.add(new Produto("The Legend of Zelda: Breath of the Wild", 350.00, 100,
				new ArrayList<>(List.of("Nintendo")), LocalDate.of(2017, 03, 05),
				"Embarque em uma jornada épica através do vasto reino de Hyrule, onde o destino do mundo repousa sobre seus ombros. Em 'The Legend of Zelda: Breath of the Wild', mergulhe em um mundo aberto deslumbrante, repleto de mistérios a serem descobertos, terras vastas para explorar e desafios emocionantes para enfrentar",
				"Nintendo", 10, "Aventura",
				new ArrayList<>(
						List.of("inglês", "francês", "espanhol", "alemão", "italiano", "holandês", "russo", "japonês")),
				10.00));

		jogos.add(new Produto("The Sims 5", 199.99, 500,
				new ArrayList<>(List.of("PC", "PlayStation 5", "Xbox Series X")), LocalDate.of(2022, 10, 15),
				"É a última adição à icônica série de simuladores de vida. Explore um mundo aberto expansivo, crie seus Sims com detalhes ainda mais precisos.",
				"Electronic Arts", 12, "Simulação de Vida", new ArrayList<>(List.of("Inglês", "Francês", "Alemão",
						"Espanhol", "Italiano", "Português", "Russo", "Chinês", "Japonês", "Coreano")),
				10.00));

		jogos.add(new Produto("Age of Empires II", 15.00, 100, new ArrayList<>(List.of("PC")),
				LocalDate.of(2000, 8, 24),
				"é uma expansão que adiciona novas civilizações, unidades e campanhas, proporcionando uma experiência aprimorada de construção de impérios e estratégias militares ao longo de períodos históricos",
				"Microsoft", 12, "RTS", new ArrayList<>(List.of("Inglês", "Francês", "Alemão", "Espanhol", "Italiano",
						"Português", "Russo", "Chinês", "Japonês", "Coreano")),
				10.00));

		jogos.add(new Produto("Resident Evil 4", 39.99, 50, new ArrayList<>(List.of("PC", "PlayStation", "Xbox")),
				LocalDate.of(2005, 10, 25),
				"Um clássico jogo de survival horror que redefine a experiência de terror nos videogames.", "Capcom",
				18, "Survival Horror", new ArrayList<>(List.of("Inglês", "Espanhol", "Francês", "Alemão", "Italiano",
						"Português", "Japonês", "Coreano")),
				8.09));

		jogos.add(new Produto("Assassin's Creed", 49.99, 75, new ArrayList<>(List.of("PC", "PlayStation", "Xbox")),
				LocalDate.of(2007, 11, 13),
				"Um jogo de ação e aventura que se passa em diversos períodos históricos, permitindo que os jogadores vivam a experiência de ser um assassino habilidoso.",
				"Ubisoft", 17, "Ação e Aventura", new ArrayList<>(List.of("Inglês", "Francês", "Alemão", "Espanhol",
						"Italiano", "Português", "Russo", "Chinês", "Japonês", "Coreano")),
				7.05));

		jogos.add(new Produto("Mortal Kombat", 59.99, 40,
				new ArrayList<>(List.of("PC", "PlayStation", "Xbox", "Nintendo Switch")), LocalDate.of(1992, 10, 8),
				"Um clássico jogo de luta conhecido por seus personagens icônicos e combates sangrentos e intensos.",
				"NetherRealm Studios", 18, "Luta", new ArrayList<>(List.of("Inglês", "Espanhol", "Francês", "Alemão",
						"Italiano", "Português", "Russo", "Chinês", "Japonês", "Coreano")),
				8.00));

		jogos.add(new Produto("Crash Bandicoot", 29.99, 60,
				new ArrayList<>(List.of("PlayStation", "Xbox", "Nintendo Switch")), LocalDate.of(1996, 9, 9),
				"Um clássico jogo de plataforma onde os jogadores controlam o personagem Crash Bandicoot em sua missão para derrotar o vilão Dr. Neo Cortex.",
				"Naughty Dog", 10, "Aventura", new ArrayList<>(List.of("Inglês", "Espanhol", "Francês", "Alemão",
						"Italiano", "Português", "Russo", "Chinês", "Japonês", "Coreano")),
				0.00));

		jogos.add(new Produto("Guitar Hero", 39.99, 50,
				new ArrayList<>(List.of("PlayStation", "Xbox", "Nintendo Switch")), LocalDate.of(2005, 11, 8),
				"Um jogo musical onde os jogadores simulam tocar guitarra, baixo ou bateria ao seguir as notas na tela, proporcionando uma experiência imersiva de performance musical.",
				"Harmonix Music Systems", 12, "Música", new ArrayList<>(List.of("Inglês", "Espanhol", "Francês",
						"Alemão", "Italiano", "Português", "Russo", "Chinês", "Japonês", "Coreano")),
				9.67));

		jogos.add(new Produto("Plants vs. Zombies", 19.99, 80,
				new ArrayList<>(List.of("PC", "PlayStation", "Xbox", "Nintendo Switch", "Mobile")),
				LocalDate.of(2009, 5, 5),
				"Um jogo de estratégia em que os jogadores usam plantas para defender suas casas contra uma invasão de zumbis.",
				"PopCap Games", 10, "Estratégia", new ArrayList<>(List.of("Inglês", "Espanhol", "Francês", "Alemão",
						"Italiano", "Português", "Russo", "Chinês", "Japonês", "Coreano")),
				9.00));

		jogos.add(new Produto("Devil May Cry", 49.99, 60,
				new ArrayList<>(List.of("PC", "PlayStation", "Xbox", "Nintendo Switch")), LocalDate.of(2001, 8, 23),
				"Um jogo de ação e aventura que segue as aventuras do caçador de demônios Dante, conhecido por sua jogabilidade intensa e estilizada.",
				"Capcom", 17, "Ação e Aventura", new ArrayList<>(List.of("Inglês", "Espanhol", "Francês", "Alemão",
						"Italiano", "Português", "Russo", "Chinês", "Japonês", "Coreano")),
				0.00));

		jogos.add(new Produto("Need for Speed", 59.99, 70, new ArrayList<>(List.of("PC", "PlayStation", "Xbox")),
				LocalDate.of(1994, 8, 31),
				"Uma franquia de corrida que oferece uma variedade de carros, personalização e corridas emocionantes em diferentes ambientes urbanos.",
				"Electronic Arts", 12, "Corrida", new ArrayList<>(List.of("Inglês", "Espanhol", "Francês", "Alemão",
						"Italiano", "Português", "Russo", "Chinês", "Japonês", "Coreano")),
				0.00));

		jogos.add(new Produto("Hellblade", 49.99, 40, new ArrayList<>(List.of("PC", "PlayStation", "Xbox")),
				LocalDate.of(2017, 8, 8),
				"Um jogo de ação e aventura que mergulha os jogadores em uma narrativa sombria e psicológica, explorando temas profundos relacionados à saúde mental.",
				"Ninja Theory", 18, "Ação e Aventura", new ArrayList<>(List.of("Inglês", "Espanhol", "Francês",
						"Alemão", "Italiano", "Português", "Russo", "Chinês", "Japonês", "Coreano")),
				5.00));

		int opcao;
		
		do {
			exibirMenuPrincipal();
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();// Limpar o buffer de entrada
			
			switch (opcao) {
			case 1:
				System.out.println("\nLista de Jogos");
				for (Produto jogo : jogos) {
					jogo.visualizar();
				}
				break;
			case 2:
				// adicionarAoCarrinho(jogos);
				break;
			case 3:
				// exibirMenuCarrinho(jogos);
				break;
			case 0: System.out.println("Finalizando programa...");	
			}

		} while (opcao != 0);

	}

	private static void exibirMenuPrincipal() {
		System.out.println("\n==== Menu Principal ====");
		System.out.println("1. Visualizar Produtos");
		System.out.println("2. Adicionar ao Carrinho");
		System.out.println("3. Carrinho de Compras");
		System.out.println("0. Sair");
	}
}
