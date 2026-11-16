package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fag.objeto.Concessionaria;
public class Principal {

		static Scanner scan = new Scanner(System.in);
		static List<Concessionaria> concessionarias = new ArrayList<Concessionaria>();
		
	public static void main(String[] args) {
		mostrarMenu();
		

	}

	private static void mostrarMenu() {
		int escolha = 0;
		do {
			System.out.println("------menu------");
			System.out.println("1) adicionar carro");
			System.out.println("2) listar carros");
			System.out.println("3) remover carro");
			System.out.println("4) alterar carro");
			System.out.println("0) sair");
			
			escolha = scan.nextInt();
			scan.nextLine();
			
			verificarEscolha(escolha);
			
		} while (escolha != 0);
		
	}

	private static void verificarEscolha(int escolha) {
		if(escolha == 1) {
			adicionarCarro();
			
		}
		if(escolha == 2) {
			listarCarro();
			
				}
		if(escolha == 3) {
			removerCarro();
			
		}
		if(escolha == 4) {
			alterarCarro();
			
		}
		
	}

	private static void alterarCarro() {
		listarCarro();
		System.out.println("Escolha o indice do carro que quer alterar");
		int escolha = scan.nextInt() - 1;
		scan.nextLine();
	
		
		if (escolha >= concessionarias.size() || escolha < 0) {
			System.out.println("insira um indice de carro valido");
			return;
			
		}
		
		Concessionaria concessionaria = concessionarias.get(escolha);
		System.out.println("Insira o novo  nome do carro");
		concessionaria.setNome(scan.nextLine());
		System.out.println("Insira a nova placa do carro");
		concessionaria.setPlaca(scan.nextLine());
		System.out.println("Insira o novo ano do carro");
		concessionaria.setAno(scan.nextInt());
		scan.nextLine();
		
		
		
		System.out.println("carro alterado com sucesso");
		
		
		
	}

	private static void removerCarro() {
		listarCarro();
		System.out.println("Escolha o indice do carro que quer remover");
		int escolha = scan.nextInt() - 1;
		scan.nextLine();
	
		
		if (escolha >= concessionarias.size() || escolha < 0) {
			System.out.println("insira um indice de carro valido");
			return;
			
		}
		
		concessionarias.remove(escolha);
		System.out.println("carro removido com sucesso !");
		
		
	}

	private static void listarCarro() {
		System.out.println("------lista de carros--------");
		for (int i = 0; i < concessionarias.size(); i++) {
			concessionarias.get(i).mostrarDados(i + 1);
			
		}
		System.out.println("-----------------------------");
	}

	private static void adicionarCarro() {
		Concessionaria concessionaria = new Concessionaria();
		System.out.println("Insira o nome do carro");
		concessionaria.setNome(scan.nextLine());
		System.out.println("Insira a placa do carro");
		concessionaria.setPlaca(scan.nextLine());
		System.out.println("Insira o ano do carro");
		concessionaria.setAno(scan.nextInt());
		scan.nextLine();
		
		concessionarias.add(concessionaria);
		
		
		
	}

}
