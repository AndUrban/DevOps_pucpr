package entities;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Livro> livros;

	public Biblioteca() {
		livros = new ArrayList<>();
	}

	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}

	public void listarLivros() {
		if (livros.isEmpty()) {
			System.out.println("A biblioteca está vazia.");
		} else {
			for (int i = 0; i < livros.size(); i++) {
				System.out.println((i + 1) + ". " + livros.get(i));
			}
		}
	}

	public void emprestarLivro(int indice) {
		if (indice >= 0 && indice < livros.size()) {
			livros.get(indice).emprestar();
		} else {
			System.out.println("Índice inválido.");
		}
	}

	public void devolverLivro(int indice) {
		if (indice >= 0 && indice < livros.size()) {
			livros.get(indice).devolver();
		} else {
			System.out.println("Índice inválido.");
		}
	}
}
