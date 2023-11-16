package JavaInicial;

import java.util.Scanner;

public class LacoDecisaoIf {

	public static void main(String[] args) {
		float n1, n2, n3, media;
		
		/*&& todas entradas devem ser verdadeiras = verdadeiro
		|| uma das entradas devem ser verdadeiras = verdadeiro*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Entre com a primeira nota: ");
		n1 =  sc.nextFloat();
		System.out.println("\n Entre com a primeira nota: ");
		n2 = sc.nextFloat();
		System.out.println("\n Entre com a primeira nota: ");
		n3 = sc.nextFloat();
		
		media = (n1+n2+n3)/3;
		System.out.printf( "\n Média Aritmética: %.2f",  media);
		
		if(media>= 7 && media <=10) {
			System.out.print("\nAluno Aprovado!!!");
		}else if(media>=5 && media<7) {
			System.out.print("\nAluno de exame!!!");		
		}else {
			System.out.print("\nAluno Reprovado!!!");
		}
		
		sc.close();
	}

}
