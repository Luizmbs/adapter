package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void deveRetornarConceitoLivro() {
        Book livro = new Book();
        livro.setAvaliacao("Ótimo");

        assertEquals("Ótimo", livro.getAvaliacao());
    }

    @Test
    void deveRetornarNotaLivro() {
        Book livro = new Book();
        livro.setAvaliacao("Ótimo");

        assertEquals(9.0f, livro.getNota());
    }

}
