package org.example;

public class Book {

    Rating avaliacao;
    RatingAdapter persistencia;

    public Book() {
        avaliacao = new ConceptRating();
        persistencia = new RatingAdapter(avaliacao);
    }

    public void setAvaliacao(String conceito) {
        avaliacao.setAvaliacao(conceito);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    public float getNota() {
        return persistencia.getNota();
    }

}
