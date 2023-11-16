package JavaInicial;

import java.util.Scanner;

public class LacoDecisaoSwitch {

	public static void main(String[] args) {
		int op;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\tMenu de Elogios");
		System.out.println("\n1- Família DETERMINADA");
		System.out.println("\n2- Família DEDICADA");
		System.out.println("\n3- Família ALEGRE");
		System.out.println("\n4- Família PERSISTENTE");
		System.out.println("\nEscolha a sua opção de elogio: ");
		op = sc.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("Família DETERMINADA");
			break;
		case 2: 
			System.out.println("Família DEDICADA");
			break;
		case 3:
			System.out.println("Família ALEGRE");
			break;
		case 4:
			System.out.println("Família PERSISTENTE");
			break;
			default:
				System.out.println("\nOpção inválidada");
			
		sc.close();
		}

	}

}
