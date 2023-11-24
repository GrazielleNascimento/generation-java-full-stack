package optional;

import java.util.Optional;

public class AplicOptional {

	public static void main(String[] args) {

		Colaborador c1 = new Colaborador(1L, "James Bond", 1000.0f);// estamos instanciando
		// a nossa classe Colaborador e passando os argumentos para o objeto c1
		// (colaborador)

		Optional<Colaborador> colaboradorOptional = Optional.of(c1);
		// estamos criando o optional do tipo Colaborador e criando uma saída do tipo
		// optional com o método of(), pois vai me retornar um optional, com o valor
		// fornecido,
		// no caso, o objeto c1. Obs.: O valor não pode ser nulo

		colaboradorOptional.map(resposta -> resposta.getNome())
				.filter(colaboradorNome -> colaboradorNome.startsWith("T"))
				.orElseThrow(() -> new RuntimeException("Colaborador não encontrado!"));
		//
		System.out.println("\nNome do Colaborador: " + colaboradorOptional.get().getNome());

	}

}
