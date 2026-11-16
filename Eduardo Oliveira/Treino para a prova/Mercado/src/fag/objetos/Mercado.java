package fag.objetos;

public class Mercado {

		private String produto;
		private int quantidade;
		
		
		
		
		public Mercado() {
			
		}
		public Mercado(String produto, int quantidade) {
		
			this.produto = produto;
			this.quantidade = quantidade;
		}
		public String getProduto() {
			return produto;
		}
		public void setProduto(String produto) {
			if(produto.isBlank()) {
				System.out.println("insira um produto valido");
				return;
				
			}
			this.produto = produto;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			if(quantidade < 0) {
				System.out.println("insira uma quantidade valida");
				return;
				
			}
			this.quantidade = quantidade;
		}
		
		public void mostrarDados(int posicao) {
			System.out.println(posicao + " ) " + produto + "/ quantidade em estoque : " + quantidade );
		}
		
		
}
