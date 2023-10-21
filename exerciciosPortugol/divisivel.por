//Exercício 2: Crie uma função capaz de processar um número
//e verificar se é divisível por 4 ou 9. O resultado verdadeiro (verdadeiro)
//deve ser emitido para o console se o número for divisível por 4 ou 9,
//e falso (falso) se o número não for divisível.

//36: 36 é divisível por 4 (36 / 4 = 9) e por 9 (36 / 9 = 4).

//144: 144 é divisível por 4 (144 / 4 = 36) e por 9 (144 / 9 = 16).
programa
{
	
	funcao inicio()
	{
		inteiro num 
		logico divisivel

		escreva("Informe um numero: ")
		leia(num)

		/*se (numero % 4 == 0 || numero % 9 == 0) {

          escreva("verdadeiro")

          } senao {

          escreva("falso")

         }*/

		 divisivel = (num % 4 == 0 ou num % 9 == 0)

		 escreva(divisivel)
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 650; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */