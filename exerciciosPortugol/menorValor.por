//Considerando uma lista de números [-1, 3, 4, 2, 6],
// desenvolva um algoritmo que seja capaz de identificar o menor número.

programa {
  funcao inicio() {

    inteiro  numeros[5] = {-1, 3, 4, 2, 6}
    inteiro menor = 0

    para(inteiro i = 0; i<= 4; i++){
   
	se(i == 0){

	menor = numeros[i] 
  	
  	} 
  	se(numeros[i] < menor){
  		menor = numeros[i]
  	}
  	
    }
    escreva(" O menor numero é ", menor)
    
  }

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 202; 
 * @PONTOS-DE-PARADA = 7;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */