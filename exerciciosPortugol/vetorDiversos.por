//Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
//Todos os elementos nos índices ímpares do vetor 
//Todos os elementos do vetor que são números pares
//A Soma de todos os elementos do vetor
//A Média de todos os elementos do vetor, armazenada em uma variável do tipo real


programa
{
	
	funcao inicio()
	{
		inteiro i, num[10], soma =0
		real media =0

		para( i = 0; i < 10; i++){

			escreva("Informe o ", i+1," numero: " )
			leia(num[i])

			soma = soma + num[i]

			media = soma / 10		
		}
		
		escreva("\nElementos nos índices ímpares: ")
		para(i = 0; i<10; i++){

			se(i %2 != 0){
				escreva(num[i], " ")
			}
							
		}

	     escreva("\nElementos pares: ")	
		para(i = 0; i<10; i++){
			
			se(num[i] %2 == 0){
				escreva(num[i], " ")
			}
		
		}
		
		escreva("\nA soma dos numeros é: ", soma)

		escreva("\nA media dos numeros é: ", media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 871; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */