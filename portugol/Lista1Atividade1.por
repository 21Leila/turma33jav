programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias,idade

		escreva ("Quantos anos voce tem")
		leia (anos)
		escreva ("Quantos meses voce tem")
		leia (meses)
		escreva ("Quantos dias voce tem")
		leia (dias)

		//idade em dias 1 ano 1 *30+1=365+30+1=396

		idade=(anos *365)+(meses *30) + dias

		escreva( "Minha idade aproximadamente é:" +idade + "dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 71; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */