// Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, 
//caso contrário imprimi-la com o valor zero


programa
{
	
	funcao inicio()
	{ 
	    real N
	    escreva("Digite o valor de N: ")
	    leia(N)


	    se(N>=100){
	    	escreva("o valor de N é: " +N)
	    }
	    senao{
	    	     escreva("o valor de N não pode ser informação,pois é menor que 100: ")
	    }
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */