package JavaInicial;

import java.util.Scanner;

//nao sabe quantos numeros somatorios dos pares, entre com n numeros e so saia quando digitar 0
public class LacoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, somaPar=0, contImpar=0;
		
		System.out.println("Entre com um número: ");
		num = sc.nextInt();
		
		while(num != 0) { //  enquanto o num for diferente de 0 vai rodar
			
			if(num % 2 == 0) { // par
				somaPar += num; // somaPar = somaPar + num
			}else { 
				contImpar++; //contImpar = contImpar + 1;
			}
			System.out.println("\nEntre com um número: ");
			num = sc.nextInt();
		}
		System.out.println("\nSomatório dos números pares: " + somaPar);
		System.out.println("\nQuantidade de números ímpares: " + contImpar);
		
		sc.close();
	}
	

}
