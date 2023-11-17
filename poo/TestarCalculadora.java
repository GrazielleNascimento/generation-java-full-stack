package poo;

import java.util.Scanner;

public class TestarCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float n1=0,n2=0;
		int op;
		
		do {
			
			System.out.println("\nCalculadora da Família 69");
			System.out.println("\n1 - Somar");
			System.out.println("\n2 - Subtrair");
			System.out.println("\n3 - Multiplicar");
			System.out.println("\n4 - Dividir");
			System.out.println("\n5 - Mostrar a frase");
			System.out.println("\n0 - Sair");
			System.out.println("\nDigite a sua opção: ");
			op = leia.nextInt();
			
			if(op<0 || op>4) {
				System.out.println("\nOpções inválidas...");
			}else if(op == 0) {
				System.out.println("\nSair do programa!!!");
			}else {
			System.out.println("\nEntre com o primeiro número: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com o segundo número: ");
			n2 = leia.nextFloat();
			
			
			switch(op) {
			case 1:
				System.out.println("\nSoma: "+Calculadora.somar(n1, n2));
				break;
			case 2:
				System.out.println("\nSubtrair: "+Calculadora.subtrair(n1, n2));
				break;
			case 3:
				System.out.println("\nMultiplicação: "+Calculadora.multiplicar(n1, n2));
				break;
			case 4:
				System.out.println("\nDivisão: "+Calculadora.dividir(n1, n2));
				break;
			case 5:
				Calculadora.frase();
				break;
			case 0:
				System.out.println("\nSair da Calculadora");
				break;
				default:
					System.out.println("\nOpção inválida!!!");
				
			}}
		}while(op != 0);
	}

}