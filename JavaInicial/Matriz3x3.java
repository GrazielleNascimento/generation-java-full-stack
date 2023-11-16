package JavaInicial;

import java.util.Scanner;

//multiplos de 5
public class Matriz3x3 {
	/*
	 * 0,0 0,1 0,2 4 5 6 1,0 1,1 1,2 1 2 3 2,0 2,1 2,2 7 8 9
	 */
	public static void main(String[] args) {
		/*
		 
		 0,0	0,1		0,2		3	5	6
		 1,0	1,1		1,2		1	11	3
		 2,0	2,1		2,2		7	33	9
		 
		 */
		
		int matriz[][] = new int[3][3];
		int linha,coluna,somaDiagonal=0,somaDiagSec=0;
		Scanner ler = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um número: ");
				matriz[linha][coluna] = ler.nextInt();
				
				if(matriz[linha][coluna] % 5 ==0) {
					System.out.println("\nO número "+matriz[linha][coluna]+" é múltiplo de 5");
				}
				
				if(linha == coluna) {
					somaDiagonal += matriz[linha][coluna];
				}
				
				if((linha+coluna) == 2) {
					somaDiagSec += matriz[linha][coluna];
				}
			}
		}
		
		System.out.println("\nSomatório da diagonal principal: "+somaDiagonal);
		System.out.println("\nSomatório da diagonal secundária: "+somaDiagSec);

	}
	
}
