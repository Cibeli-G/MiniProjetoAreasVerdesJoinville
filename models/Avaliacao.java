package Lab365MiniProjetoAreasVerdesJoinville.models;

public class Avaliacao {
    private int id;
    private int quantidadeArvores;
    private int qualidadeAr;
    private int ausenciaPoluicaoSonora;
    private int coletaResiduos;
    private int facilidadeTransportePublico;
    private int idAreaVerde;

    public Avaliacao(int id, int quantidadeArvores, int qualidadeAr, int ausenciaPoluicaoSonora, int coletaResiduos, int facilidadeTransportePublico, int idAreaVerde) {
        this.id = id;
        this.quantidadeArvores = quantidadeArvores;
        this.qualidadeAr = qualidadeAr;
        this.ausenciaPoluicaoSonora = ausenciaPoluicaoSonora;
        this.coletaResiduos = coletaResiduos;
        this.facilidadeTransportePublico = facilidadeTransportePublico;
        this.idAreaVerde = idAreaVerde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidadeArvores() {
        return quantidadeArvores;
    }

    public void setQuantidadeArvores(int quantidadeArvores) {
        this.quantidadeArvores = quantidadeArvores;
    }

    public int getQualidadeAr() {
        return qualidadeAr;
    }

    public void setQualidadeAr(int qualidadeAr) {
        this.qualidadeAr = qualidadeAr;
    }

    public int getAusenciaPoluicaoSonora() {
        return ausenciaPoluicaoSonora;
    }

    public void setAusenciaPoluicaoSonora(int ausenciaPoluicaoSonora) {
        this.ausenciaPoluicaoSonora = ausenciaPoluicaoSonora;
    }

    public int getColetaResiduos() {
        return coletaResiduos;
    }

    public void setColetaResiduos(int coletaResiduos) {
        this.coletaResiduos = coletaResiduos;
    }

    public int getFacilidadeTransportePublico() {
        return facilidadeTransportePublico;
    }

    public void setFacilidadeTransportePublico(int facilidadeTransportePublico) {
        this.facilidadeTransportePublico = facilidadeTransportePublico;
    }

    public int getIdAreaVerde() {
        return idAreaVerde;
    }

    public void setIdAreaVerde(int idAreaVerde) {
        this.idAreaVerde = idAreaVerde;
    }

    public double calcularMedia() {
        return (quantidadeArvores + qualidadeAr + ausenciaPoluicaoSonora + coletaResiduos + facilidadeTransportePublico) / 5.0;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "id=" + id +
                ", quantidadeArvores=" + quantidadeArvores +
                ", qualidadeAr=" + qualidadeAr +
                ", ausenciaPoluicaoSonora=" + ausenciaPoluicaoSonora +
                ", coletaResiduos=" + coletaResiduos +
                ", facilidadeTransportePublico=" + facilidadeTransportePublico +
                ", idAreaVerde=" + idAreaVerde +
                '}';
    }
}