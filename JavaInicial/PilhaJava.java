package JavaInicial;

import java.util.Iterator;
import java.util.Stack;

public class PilhaJava {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Abacate");
		pilha.push("Limão");
		pilha.push("Melão");
		pilha.push("Tomate");
		pilha.push("Kiwi");
		pilha.push("Lichia");
		
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nRetirar elemento: "+pilha.pop());
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nElemento no topo da pilha: "+pilha.peek());
		System.out.println("\nAdicionar elemento na pilha: "+pilha.push("Maracujá"));
		System.out.println("\nExibir a pilha atualizada: "+pilha);
		System.out.println("\nTamanho da pilha: "+pilha.size());
		System.out.println("\nVerificar se existe um elemento chamado Kiwi "
				+ "na minha pilha: "+pilha.contains("Kiwi"));
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		pilha.clear();
		
		System.out.println("\nA pilha está vazia? "+pilha.isEmpty());

	}

}