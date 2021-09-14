package ProjetoGenEcommerce;

public class Produtos {
	
	
	System.out.print("Selecione o código do produto que você deseja: ");
	leia.nextLine();
	codigoEscolhido = leia.next();

	// MOSTRA O PRODUTO SELECIONADO SELECIONA A QUANTIDADE E ADICIONA NO CARRINHO

	for (x = 0; x < 10; x++) {
		if (codigoEscolhido.equals(codigoProdutos[x])) {
			limpaTela();
			System.out.print("<LIVRO ESCOLHIDO>\n\n");
			System.out.print("Código:\tLivro:\t                        Valores:\tEstoque:\n");
			System.out.print(codigoProdutos[x] + "\t" + nomeProdutos[x] + "\tR$" + valoresdosProdutos[x]
					+ "\t         " + estoque[x] + "\n");
			System.out.print("\n");

			System.out.print("Digite a quantidade necessária: ");
			leia.nextLine();
			estoqueEscolhido[x] = leia.nextInt();

			if (estoqueEscolhido[x] <= estoque[x] && carrinho[x].equals(" ") && estoqueEscolhido[x] > 0) {
				limpaTela();

				System.out.print("<CARRINHO>\n\n");
				System.out.print("Código:\tLivro:\t                      Valor:\tQuantidade:\n");
				carrinho[x] = codigoProdutos[x] + "\t" + nomeProdutos[x] + "\tR$"
						+ (valoresdosProdutos[x] * estoqueEscolhido[x]) + "\t   " + estoqueEscolhido[x]
						+ "\n";

				for (int c = 0; c < 10; c++) {
					if (!carrinho[c].equals(" ")) {
						System.out.print(carrinho[c]);
						valorTotal = valoresdosProdutos[x] * estoqueEscolhido[x];
					}
				}
				System.out.print("\n");

				valorFinal = valorTotal + valorFinal;

				System.out.print("Continuar a compra ? Sim(S)/Não(N): ");
				continuarCompra = leia.next().charAt(0);
				limpaTela();// Limpa para a lista de produtos
				while (continuarCompra != 'S' && continuarCompra != 's' && continuarCompra != 'N'
						&& continuarCompra != 'n') {
					System.out.print("<Opção Inválida, escreve (S) ou (N)>\n\n");
					System.out.print("Continuar a compra ? Sim(S)/Não(N): ");
					continuarCompra = leia.next().charAt(0);
					limpaTela();
				}
				while (!carrinho[0].equals(" ") && !carrinho[1].equals(" ") && !carrinho[2].equals(" ")
						&& !carrinho[3].equals(" ") && !carrinho[4].equals(" ") && !carrinho[5].equals(" ")
						&& !carrinho[6].equals(" ") && !carrinho[7].equals(" ") && !carrinho[8].equals(" ")
						&& !carrinho[9].equals(" ")) {
					System.out.print("Carrinho cheio, finalize sua compra");

					System.out.print("\nContinuar a compra ? Sim(S)/Não(N) ");
					continuarCompra = leia.next().charAt(0);
					limpaTela();
					if (continuarCompra == 'n' || continuarCompra == 'N') {
						break;
					}
				}
			} else if (estoqueEscolhido[x] > estoque[x]) {
				limpaTela();
				System.out.print("\n\n<Desculpe, estoque indisponível - Escolha novamente!!>\n\n");
				// para (x=0; x<10; x++){
				// estoqueEscolhido[x]=0
				// }

				// contagem(5) //contagem regressiva de 5 segundos/ Já tem o "limpa()" no final
				contador(5);
				QUANTIDADE++; // roda o para de novo
				estoqueEscolhido[x] = 0;
				break;
			} else if (!carrinho[x].equals(" ")) {
				limpaTela();
				System.out
						.print("\n\n<Não é possível adicionar dois produtos iguais. Escolha outro!!>\n\n");

				// contagem(5) //contagem regressiva de 5 segundos/ Já tem o "limpa()" no final
				contador(5);
				QUANTIDADE++; // roda o para de novo
				break;
			} else if (estoqueEscolhido[x] <= 0) {
				limpaTela();
				System.out.print("\nQuantidade inválida - Escolha novamente!!\n\n");

				// contagem(5) //contagem regressiva de 5 segundos/ Já tem o "limpa()" no final
				contador(5);
				QUANTIDADE++; // roda o para de novo
				estoqueEscolhido[x] = 0;
				break;

			}
		} else if (!codigoEscolhido.equals(codigoProdutos[0]) && !codigoEscolhido.equals(codigoProdutos[1])
				&& !codigoEscolhido.equals(codigoProdutos[2]) && !codigoEscolhido.equals(codigoProdutos[3])
				&& !codigoEscolhido.equals(codigoProdutos[4]) && !codigoEscolhido.equals(codigoProdutos[5])
				&& !codigoEscolhido.equals(codigoProdutos[6]) && !codigoEscolhido.equals(codigoProdutos[7])
				&& !codigoEscolhido.equals(codigoProdutos[8])
				&& !codigoEscolhido.equals(codigoProdutos[9])) {
			limpaTela();
			QUANTIDADE++; // roda o para de novo
			System.out.print("\nProduto inválido\n\n");
			// contagem(5) //contagem regressiva de 5 segundos / Já tem o "limpa()" no final
			contador(5);
			break;

		}

	}

}
