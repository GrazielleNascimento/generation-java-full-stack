package poo2;

public class TestarEmpregado {

	public static void main(String[] args) {

		Empregado[] emp = new Empregado[3];

		emp[0] = new Empregado("Ana", 10000);
		emp[1] = new Empregado("Daniel Ferreira", 8000);
		emp[2] = new Empregado("Nayane Karen Santos Rosa", 9000);

		for (Empregado roda : emp) {

			roda.imprimir();
		}

		System.out.println("****************************************************");

		for (Empregado roda : emp) {

			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}

}
