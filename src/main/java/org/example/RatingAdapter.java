package org.example;

public class RatingAdapter extends ScoreRating {

    private Rating avaliacaoConceito;

    public RatingAdapter(Rating avaliacaoConceito) {
        this.avaliacaoConceito = avaliacaoConceito;
    }

    public String recuperarAvaliacao() {
        if (this.getNota() >= 9.0f)
            avaliacaoConceito.setAvaliacao("Ótimo");
        else
            if (this.getNota() >= 8.0f)
                avaliacaoConceito.setAvaliacao("Bom");
            else
                if (this.getNota() >= 7.0f)
                    avaliacaoConceito.setAvaliacao("Regular");
                else
                    avaliacaoConceito.setAvaliacao("Ruim");
        return avaliacaoConceito.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoConceito.getAvaliacao().equals("Ótimo"))
            this.setNota(9.0f);
        else
            if (avaliacaoConceito.getAvaliacao().equals("Bom"))
                this.setNota(8.0f);
            else
                if (avaliacaoConceito.getAvaliacao().equals("Regular"))
                    this.setNota(7.0f);
                else
                    this.setNota(0.0f);
    }
}
