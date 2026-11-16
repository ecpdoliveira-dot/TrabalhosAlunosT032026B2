package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fag.objetos.Biblioteca;
public class Principal {

		static Scanner scan = new Scanner(System.in);
		static List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
		
	public static void main(String[] args) {
		mostrarMenu();
		

	}

	private static void mostrarMenu() {
		int escolha = 0;
		do {
			System.out.println("-------menu--------");
			System.out.println("1) adicionar livro");
			System.out.println("2) listar livros");
			System.out.println("3) remover livro");
			System.out.println("4) alterar livro");
			System.out.println("0) Sair");
			
			escolha=scan.nextInt();
			scan.nextLine();
			
			verificarEscolha(escolha);
		} while (escolha != 0 );
		
	}

	private static void verificarEscolha(int escolha) {
		if (escolha == 1) {
			adicionarLivro();
		}
		if (escolha == 2) {
			listarLivro();
			
		}
		if (escolha == 3) {
			removerlivro();
			
		}
		if (escolha == 4) {
			alterarLivro();
		}
		
	}

	private static void alterarLivro() {
		listarLivro();
		System.out.println("Insira o indice do produto que deseja alterar");
		int escolha = scan.nextInt() - 1;
		scan.nextLine();
		if (escolha >= bibliotecas.size() || escolha < 0) {
			System.out.println("Insira um indice de produto valido! ");
			return;
		}
		
		Biblioteca biblioteca = bibliotecas.get(escolha);
		System.out.println("Insira o novo nome do livro: ");
		biblioteca.setLivro(scan.nextLine());
		System.out.println("Insira o novo nome do autor: ");
		biblioteca.setAutor(scan.nextLine());
		System.out.println("Insira a nova quantidade de paginas: ");
		biblioteca.setPaginas(scan.nextInt());
		scan.nextLine();
		
		System.out.println("livro alterado com sucesso! ");
	}

	private static void removerlivro() {
		listarLivro();
		
		System.out.println("Insira o indice do produto que deseja remover");
		int escolha = scan.nextInt() - 1;
		scan.nextLine();
		if (escolha >= bibliotecas.size() || escolha < 0) {
			System.out.println("Insira um indice de produto valido! ");
			return;
		}
		bibliotecas.remove(escolha);
		
		
	}

	private static void listarLivro() {
		System.out.println("----lista de livros----");
		for (int i = 0; i < bibliotecas.size(); i++) {
			bibliotecas.get(i).mostrarDados(i + 1);
			
		}
		System.out.println("------------------------");
	}

	private static void adicionarLivro() {
		Biblioteca biblioteca = new Biblioteca();
		System.out.println("Insira o nome do livro: ");
		biblioteca.setLivro(scan.nextLine());
		System.out.println("Insira o nome do autor: ");
		biblioteca.setAutor(scan.nextLine());
		System.out.println("Insira a quantidade de paginas: ");
		biblioteca.setPaginas(scan.nextInt());
		scan.nextLine();
		
		bibliotecas.add(biblioteca);
		
		System.out.println("livro adicionado com sucesso! ");
		
		
	}

}
