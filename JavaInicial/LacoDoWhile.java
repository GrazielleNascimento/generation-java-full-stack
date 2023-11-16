package JavaInicial;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tabuada, x=1, resultado;
		
		System.out.println("\nEntre com a Tabuada: ");
		tabuada = sc.nextInt();
		
		do {
			resultado = tabuada * x;
			System.out.println("\n" + tabuada + " x " + x + " = " + resultado);
			x++;
			
		}while(x<=10);
		
		sc.close();

	}

}
