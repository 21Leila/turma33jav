programa
{
	
	funcao inicio()
	{
		inteiro idade, mes, dia, diasNasc
		
		escreva("Quantos dias de vida voce tem: ")
		leia(diasNasc)
		
		idade = diasNasc/365
		mes = (diasNasc%365)/30
		dia = (diasNasc%365)%30
		escreva("Sua idade e "+idade+", voce nasceu no mes "+mes+" no dia "+dia) 

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 297; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */