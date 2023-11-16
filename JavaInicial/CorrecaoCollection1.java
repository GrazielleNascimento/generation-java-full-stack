package JavaInicial;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class CorrecaoCollection1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//criar ArrayList
		ArrayList<String> cores = new ArrayList<String>();
		
		//leitura do Array
		for(int i=0;i<5;i++) {
			System.out.println("\nDigita a cor número "+(i+1)+" : ");
			//String cor = leia.nextLine();
			cores.add(leia.nextLine());
		}
		
		Iterator<String> iterator = cores.iterator();
		
		//Listando as cores
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Listando as cores em ordem alfabética
		Collections.sort(cores);
		System.out.println("\nCores ordenadas: ");
		System.out.println("\n"+cores);

	}
	
	
}
