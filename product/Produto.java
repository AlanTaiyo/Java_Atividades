package product;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotal() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
		System.out.printf("Foram adicionados %d produtos ao estoque%n a nova quantidade agora é: %d%n", quantidade, this.quantidade);
	}
	public void removerProduto(int quantidade) {
		if (this.quantidade >= quantidade) {
			this.quantidade -= quantidade;
			System.out.printf("Foram adicionados %d produtos ao estoque%n a nova quantidade agora é: %d%n", quantidade, this.quantidade);			
		}
		else {
			System.out.println("Não há produtos suficiênte para a remoção solicitada.");
		}
	}
	public String toString() {
		return nome
			+ ", $ "
			+ String.format("%.2f", preco)
			+ ", "
			+ quantidade
			+ " unidades, Total: $ "
			+ String.format("%.2f", valorTotal());
	}
	/* ABAIXO FORMA QUE EU FIZ. E ACIMA A FORMA QUE O PROFESSOR FEZ.
	public void imprimeMensagem() {
		System.out.println("Nome do produto: " + nome);
		System.out.println("Preço do produto: $" + preco);
		System.out.println("Quantidade do produto: " + quantidade);
		System.out.println("Valor total: $" + valorTotal());
	} */
}
