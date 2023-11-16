package JavaInicial;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		float n1, n2, n3, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = sc.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = sc.nextFloat();
		System.out.println("Digite a terceira nota: ");
		n3 = sc.nextFloat();
		
		media = (n1 * 2 + n2 * 3 + n3 * 5)/10;
		System.out.println("Média Ponderada: " + media);
		
		sc.close();
		
		/*
	 	Operadores relacionais: <,>,<=,>=,!=,==
	 	Operadores lógicos: Operador E --> && e operador OU --> ||
	 	Módulo % --> resto da divisão por inteiros
	 */
		
		/*
		 Operador Lógico E --> &&
		 E1		E2		Saída
		 V		V		V
		 V		F		F
		 F		V		F
		 F		F		F
		 
		 Operador Lógico OU --> ||
		 
		 E1		E2		Saída
		 V		V		V
		 V		F		V
		 F		V		V
		 F		F		F
		 */

	}

}
