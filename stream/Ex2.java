package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Declaramos uma Collection chamada estados do Tipo List String, que receberá
		 * uma lista de nomes em formato de Array
		 */
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");

		System.out.println("\nExemplo - Método Count");

		/*
		 * Criamos uma Stream chamada numeroEstadosTerminaComO do tipo long (pois agora,
		 * ao final dos processos queremos saber quantos itens passaram pelo nosso
		 * filtro.
		 * 
		 * Dentro dessa Stream, usamos o método .filter() para executar uma filtragem de
		 * acordo com a lambda que passamos em seus parenteses, e com o método .count()
		 * contamos quantas vezes o processamento anterior foi antendido.
		 */
		long numeroEstadosTerminaComO = estados.stream().filter(estado -> estado.endsWith("o")).count();

		/*
		 * Aqui criamos uma outra Stream, agora do tipo List String, para pegar todos os
		 * nomes dos estados que passaram pelo filtro do método .filter() e mostrá-los
		 * em uma Collection Temporária.
		 */
		List<String> estadosTerminaComO = estados.stream().filter(estado -> estado.endsWith("o"))
				.collect(Collectors.toList());

		// Exibição dos Dados
		System.out.println("\nNúmero de Estados cujo nome terminam com a letra O: " + numeroEstadosTerminaComO);
		System.out.println("\nEstados cujo nome terminam com a letra O: " + estadosTerminaComO);

	}

}
