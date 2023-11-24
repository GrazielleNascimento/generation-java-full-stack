package pooexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {

	//demonstrar o lançamento de uma exceção 
	public static int quociente(int numerador,int denominador) throws ArithmeticException{
		return numerador / denominador;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean continuaLoop = true;
		
		do {
			
			try {
				System.out.println("\nEntre com o numerador: ");
				int numerador = scanner.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = scanner.nextInt();
				
				int resultado = quociente(numerador,denominador);
				System.out.printf("\nResultado da divisão: %d / %d = %d \n",numerador,denominador,resultado);
				continuaLoop = false;//entrada bem sucedida
			}
			catch(InputMismatchException inputMismatchException) {//vai tratar da entrada de tipos de dados
				System.err.printf("\nExceção: %s\n",inputMismatchException);//mostrar qual tipo de ecceção que estamos tratando
				scanner.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro."
						+ " Por favor, tente novamente!!!");
			}
			catch(ArithmeticException arithmeticException) {
				System.err.printf("\nExceção: %s\n",arithmeticException);
				System.out.println("\nZero é um denominador inválido!!!"
						+ " Por favor, tente novamente...");
			}
			
		}while(continuaLoop);

	}

}