package application;

import java.util.Scanner;

import entities.Biblioteca;
import entities.Livro;

public class Main {

	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca();
		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n==== Biblioteca Virtual ====");
			System.out.println("1. Adicionar Livro");
			System.out.println("2. Listar Livros");
			System.out.println("3. Emprestar Livro");
			System.out.println("4. Devolver Livro");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Título: ");
				String titulo = sc.nextLine();
				System.out.print("Autor: ");
				String autor = sc.nextLine();
				biblioteca.adicionarLivro(new Livro(titulo, autor));
				break;
			case 2:
				biblioteca.listarLivros();
				break;
			case 3:
				biblioteca.listarLivros();
				System.out.print("Digite o número do livro a emprestar: ");
				int emprestar = sc.nextInt() - 1;
				biblioteca.emprestarLivro(emprestar);
				break;
			case 4:
				biblioteca.listarLivros();
				System.out.print("Digite o número do livro a devolver: ");
				int devolver = sc.nextInt() - 1;
				biblioteca.devolverLivro(devolver);
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);

		sc.close();
		
		System.out.println("TESTE DISCORD-WEBHOOK CI");

	}

}
