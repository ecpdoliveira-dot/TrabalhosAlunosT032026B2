package fag;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fag.objeto.Time;

public class Principal {
	
	static Scanner scan = new Scanner(System.in);
	static List<Time> times = new ArrayList<Time>();
	
	
	public static void main(String[] args) {
		mostrarMenu();

	}


	private static void mostrarMenu() {
		int escolha = 0;
		
		do {
			System.out.println("-----Menu-----");
			System.out.println("1) adicionar time");
			System.out.println("2) listar times");
			System.out.println("3) remover time");
			System.out.println("4) alterar time");
			System.out.println("0) Sair");
			
			escolha = scan.nextInt();
			scan.nextLine();
			
			validarEscolha(escolha);
		} while (escolha != 0);
		
	}


	private static void validarEscolha(int escolha) {
		if (escolha == 1) {
			adicionarTime();
				}
		if (escolha == 2) {
			listarTime();
			
				}
		if (escolha == 3) {
			removerTime();
			
		}
		if (escolha == 4) {
			alterarTime();
			
		}

	}


	private static void alterarTime() {
		listarTime();
		System.out.println("insira o time que queira alterar");
		int escolha = scan.nextInt() - 1;
		scan.nextLine();
		
		if (escolha >= times.size() || escolha < 0) {
			System.out.println("insira um time valido ");
			return;
		}
		
		Time time = times.get(escolha);
		System.out.println("Novo nome do time");
		time.setNome(scan.nextLine());
		System.out.println("Novo apelido do time");
		time.setApelido(scan.nextLine());
		
		
		System.out.println("Time alterado com sucesso!");
		
		
	}


	private static void removerTime() {
		listarTime();
		System.out.println("insira o time que queira remover");
		int escolha = scan.nextInt() - 1;
		scan.nextLine();
		
		
		
		if (escolha >= times.size() || escolha < 0) {
			System.out.println("insira um time valido ");
			return;
		}
		
		times.remove(escolha);
		System.out.println("Time excluido com sucesso");
		
	}


	private static void listarTime() {
		System.out.println("---------lista de times--------");
		for (int i = 0; i < times.size(); i++) {
			
			times.get(i).mostrarDados(i + 1);
			
		}
		System.out.println("-------------------------------");
	}


	private static void adicionarTime() {
		Time time = new Time();
		System.out.println("Nome do time");
		time.setNome(scan.nextLine());
		System.out.println("Apelido do time");
		time.setApelido(scan.nextLine());
		
		times.add(time);
		System.out.println("Time adicionado com sucesso!");
		
		
		
		
	}

}
