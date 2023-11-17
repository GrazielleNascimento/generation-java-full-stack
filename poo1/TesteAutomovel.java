package poo1;

public class TesteAutomovel {

	public static void main(String[] args) {
		Automovel auto1 = new Automovel("Bianca Akemi","Opala","BIA1998",1974);
		Automovel auto2 = new Automovel("Fusca","ZXY5B56");
		auto1.imprimirInfo();
		
		System.out.println("\n****Transferência de Proprietário****");
		
		auto1.setNomeProprietario("Vitoria França");
		
		auto1.setPlaca("GCM1B45");
		
		auto1.imprimirInfo();

	}

}
