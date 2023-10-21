//. Camila é convidada a implementar um recurso que mostra o maior dos três valores na tela inicial.

programa
{
	
	funcao inicio()
	{
		
		real num[3]
		real maior= 0

		para(inteiro i=0; i<3; i++){
			
			escreva("Digite o numero: ")
			leia(num[i])

			se(i == 0 ){
			maior = num[i]
			}
			se(num[i] > maior){
				maior = num[i]				
			}
			
		}
			escreva("O maior numero é: ", maior)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */