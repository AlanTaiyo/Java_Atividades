package product;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Produto produtoNovo = new Produto();
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Você irá cadastrar um produto novo.");
		System.out.println("Digite o nome do produto A: ");
		produtoNovo.nome = leitura.nextLine();
		System.out.println("Digite o preço do produto A: ");
		produtoNovo.preco = leitura.nextDouble();
		System.out.println("Digite a quantidade do produto A: ");
		produtoNovo.quantidade = leitura.nextInt();
		
		System.out.println(produtoNovo);
		
		System.out.println("Digite a quantidade que você quer adicionar de produto: ");
		int quantidade = leitura.nextInt();
		produtoNovo.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.println("INFORMAÇÃO ATUALIZADA:");
		System.out.println(produtoNovo);
		System.out.println();
		
		System.out.println("Digite a quantidade que você quer remover de produto: ");
		quantidade = leitura.nextInt();
		produtoNovo.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("INFORMAÇÃO ATUALIZADA:");
		System.out.println(produtoNovo);
		System.out.println();
		
		leitura.close();
	}

}
