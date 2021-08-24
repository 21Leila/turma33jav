
   // 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero).
   //Em caso afirmativo, calcular a área do triângulo.7) Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.

programa
{        funcao inicio()
  {      
     real base, altura, area

     
     escreva("Digite o valor da base: ")
     leia (base)  
     escreva("Digite o valor da altura: ")
     leia (altura)
     
	 area =(base*altura) 
	 se (base <=0){
	 	escreva ("Impossivel realizar, valor da base incorreto!!")
	 }
	 senao se (altura <=0){
		escreva("Impossivel realizar, valor da altura incorreto!!")
	}
	senao{
		escreva("o valor da área é: "+area)
		}
}

} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 805; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */