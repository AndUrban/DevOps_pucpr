package entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LivroTest {

	private Livro livro;

	@BeforeEach
	void setUp() {
		livro = new Livro("Dom Casmurro", "Machado de Assis");
	}

	@Test
	void testLivroCriadoDisponivel() {
		assertFalse(livro.isEmprestado(), "O livro deve estar disponível ao ser criado.");
	}

	@Test
	void testEmprestarLivro() {
		livro.emprestar();
		assertTrue(livro.isEmprestado(), "O livro deve estar emprestado após chamada a emprestar().");
	}

	@Test
	void testDevolverLivro() {
		livro.emprestar();
		livro.devolver();
		assertFalse(livro.isEmprestado(), "O livro deve estar disponível após chamada a devolver().");
	}

	@Test
	void testToStringDisponivel() {
		String esperado = "\"Dom Casmurro\" por Machado de Assis (Disponível)";
		assertEquals(esperado, livro.toString(), "A descrição do livro disponível está incorreta.");
	}

	@Test
	void testToStringEmprestado() {
		livro.emprestar();
		String esperado = "\"Dom Casmurro\" por Machado de Assis (Emprestado)";
		assertEquals(esperado, livro.toString(), "A descrição do livro emprestado está incorreta.");
	}
}
