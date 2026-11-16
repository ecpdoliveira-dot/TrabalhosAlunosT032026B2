package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fag.objetos.Mercado;
public class Princiapal {

	static Scanner scan = new Scanner(System.in);
	static List<Mercado> mercados = new ArrayList<Mercado>();
	
	
	
	
	
	public static void main(String[] args) {
		mostrarMenu();
		

	}





	private static void mostrarMenu() {
		int escolha = 0;
		do {
			System.out.println("------menu------");
			System.out.println("1) Adicionar produto");
			System.out.println("2) listar produtos");
			System.out.println("3) Remover produto");
			System.out.println("4) Alterar produto");
			System.out.println("0) Sair");
			
			escolha = scan.nextInt();
			scan.nextLine();
			
			verificarEscolha(escolha);
		} while (escolha != 0);
		
	}





	private static void verificarEscolha(int escolha) {
		if(escolha == 1) {
			adicionarProduto();
		}
		if(escolha == 2) {
			listarProduto();		
				}
		if(escolha == 3) {
			removerProduto();
		}
		if(escolha == 4) {
			alterarProduto();
		}
	}





	private static void alterarProduto() {
		listarProduto();	
		System.out.println("Insira o indice do produto que deseja alterar");
		int escolha = scan.nextInt() - 1;
		scan.nextLine();
		if (escolha >= mercados.size() || escolha < 0) {
			System.out.println("Insira um indice de produto valido");
			return;
	}
		Mercado mercado = mercados.get(escolha);
		System.out.println("Insira o novo nome do produto ");
		mercado.setProduto(scan.nextLine());
		System.out.println("Insira a nova quantidade em estoque do produto ");
		mercado.setQuantidade(scan.nextInt());
		scan.nextLine();
		
		
		
		System.out.println("Novo produto adicionado com sucesso!");
		
		
	}



	private static void removerProduto() {
		listarProduto();
		
		System.out.println("Insira o indice do produto que deseja excluir");
		int escolha = scan.nextInt() - 1;
		scan.nextLine();
		if (escolha >= mercados.size() || escolha < 0) {
			System.out.println("Insira um indice de produto valido");
			return;
			
		}
		mercados.remove(escolha);
		
		System.out.println("Produto removido com sucesso !");
		
		
	}





	private static void listarProduto() {
		System.out.println("-----lista de produtos-------");
		for (int i = 0; i < mercados.size(); i++) {
			mercados.get(i).mostrarDados(i + 1);
			
			
		}
		System.out.println("------------------------------");
	}





	private static void adicionarProduto() {
		Mercado mercado = new Mercado();
		System.out.println("Insira o nome do produto ");
		mercado.setProduto(scan.nextLine());
		System.out.println("Insira a quantidade em estoque do produto ");
		mercado.setQuantidade(scan.nextInt());
		scan.nextLine();
		
		mercados.add(mercado);
		
		System.out.println("Produto adicionado com sucesso!");
	}

}
