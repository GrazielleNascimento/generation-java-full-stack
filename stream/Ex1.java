package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1{

	public static void main(String[] args) {
		
		//	Iniciamos uma Collection
		/*	Declaramos uma Collection chamada numeros do Tipo List Integer, 
		 * 	que receberá uma lista de numeros em formato de Array */
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("\nExemplo - Método Map");
		
		// Definimos a Stream
		/*
		 * Criamos uma Stream chamada numerosAoCubo do tipo List Integer (pois ao final
		 * dos processos queremos exibir os dados como uma nova Collection).
		 * 
		 * Dentro dessa Stream, usamos o método .map() para elevar cada número ao cubo e
		 * com o método .collect() criamos uma Collection Temporária, para podermos
		 * mostrar os dados em tela mais facilmente.
		 */
		List<Integer> numerosAoCubo = numeros.stream()
		        .map(item -> item * item * item)
		        .collect(Collectors.toList());
						
		// Exibe os dados manipulados pela Stream
		System.out.println("\nNúmeros elevados ao Cubo: " + numerosAoCubo);
		
		// Dados Originais, que não foram alterados
		System.out.println("\nCollection Original: " + numeros);
		
	}

}