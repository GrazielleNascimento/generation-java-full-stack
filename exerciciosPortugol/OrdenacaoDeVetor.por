//Dado um vetor contendo 10 números inteiros não ordenados, construa um algoritmo
programa {
  funcao inicio()
	{

		inteiro i, j, copia, tamanho
		inteiro numeros[10] = {10, 5, 1, 4, 2, 9, 3, 8, 7, 6}

		tamanho = 10

		// algoritmo bubble sort
		para(i = 0; i < tamanho - 1; i++){
      		para(j = 0; j < tamanho - 1 - i; j++){
		        se(numeros[j] < numeros[j+1]){
		          copia = numeros[j]
		          numeros[j] = numeros[j+1]
		          numeros[j+1] = copia
		        }
      		}
    		}
    		
		escreva("\nVetor de numeros inteiros ordenados em ordem decrescente: \n")
		escreva("{")
		para(i=0; i < tamanho; i++){
      escreva(numeros[i])
      se(i < tamanho-1) {
        escreva(", ")
      }
		}
		escreva("}")

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 81; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */