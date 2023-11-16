package JavaInicial;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		float n1, n2, n3, media, somaMedia = 0, mediaGeral;
		int x, na;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("\nDigite quantos alunos iremos calcular a média: ");
		na = sc.nextInt();
		
		for(x = 1; x <= na; x++ ) {
			
			System.out.print("\nEntre com a primeira nota: ");
			n1 = sc.nextFloat();
			System.out.print("Entre com a segunda nota: ");
			n2 = sc.nextFloat();
			System.out.print("Entre com a terceira nota: ");
			n3 = sc.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.println("\nMédia do aluno "+x+" : "+ media);
			somaMedia =+ media;
			sc.close();
		}
	    mediaGeral = somaMedia / na;
		System.out.printf("\n Média Geral: %.2f",mediaGeral);
		
		

	}

	

}
