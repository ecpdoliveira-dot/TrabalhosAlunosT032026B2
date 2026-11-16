package fag.objeto;

public class Time {
	
	private String nome;
	private String apelido;
	
	
	
	
	public Time() {
		
	}
	public Time(String nome, String apelido) {
		
		this.nome = nome;
		this.apelido = apelido;
	}
	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		if(nome.isBlank()) {
			System.out.println("Insira um nome valido");
			return;
		}
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		if(apelido.isBlank()) {
			System.out.println("Insira um nome valido");
			return;
		}
		this.apelido = apelido;
	}
	
	public void mostrarDados(int posicao) {
		System.out.println(posicao + " ) " + nome + " , ou tambem mais conhecido como " + apelido + "! ");
	}
}
