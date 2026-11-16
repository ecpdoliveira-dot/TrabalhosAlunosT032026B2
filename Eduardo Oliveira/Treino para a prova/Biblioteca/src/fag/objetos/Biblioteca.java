package fag.objetos;

public class Biblioteca {
	
	private String livro;
	private String autor;
	private int paginas;
	
	public Biblioteca() {
		
	}
	
	public Biblioteca(String livro, String autor, int paginas) {
		
		setLivro(livro);
		setAutor(autor);
		setPaginas(paginas);
	}
	
	
	
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		if(livro.isBlank() || autor == null) {
			System.out.println("insira um livro valido");
			return;
		}
		this.livro = livro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		if(autor.isBlank() || autor == null) {
			System.out.println("insira um autor valido");
			return;
		}
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		if(paginas < 0 || autor == null) {
			System.out.println("insira uma pagina valida");
			return;
		}
		this.paginas = paginas;
	}
	
	public void mostrarDados(int posicao) {
		System.out.println(posicao + " ) " + livro + " / Autor : " + autor + " / qtd de pag : " + paginas );
	}
	
	

	

	
	
	
}
