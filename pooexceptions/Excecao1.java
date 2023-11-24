package pooexceptions;

public class Excecao1 {

	public static void main(String[] args) {

		String frase = null;
		String novaFrase = null;

		try {// criando o bloco try para a tentativa de execução

			novaFrase = frase.toUpperCase();// transformando a String em letras maiúsculas
		} catch (NullPointerException e) {// vou capturar uma possível exceção
			// tratamento da exceção
			System.out.println("\nA frase inicial está nula, para solucionar tal problema,"
					+ " foi lhe atribuido um valor default...");
			frase = "Frase Vazia";
			novaFrase = frase.toUpperCase();
		}

		System.out.println("\nFrase antiga: " + frase);
		System.out.println("\nNova frase: " + novaFrase);

	}

}
