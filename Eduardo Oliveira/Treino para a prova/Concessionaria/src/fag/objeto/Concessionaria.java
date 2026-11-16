package fag.objeto;

public class Concessionaria {

	private String nome;
	private String placa;
	private int ano;
	
	
	
	
	public Concessionaria() {
		
	}
	public Concessionaria(String nome, String placa, int ano) {
		
		this.nome = nome;
		this.placa = placa;
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.isBlank()) {
			System.out.println("insira um nome valido ");
			return;
		}
		this.nome = nome;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		if(placa.isBlank()) {
			System.out.println("insira uma placa valida ");
			return;
		}
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if(ano < 0) {
			System.out.println("insira um ano valido ");
			return;
		}
		this.ano = ano;
	}
	
	public void mostrarDados(int posicao) {
		System.out.println(posicao + " ) " + nome + " / Placa : " + placa + " / Ano : " + ano);
	}
	
	
}
