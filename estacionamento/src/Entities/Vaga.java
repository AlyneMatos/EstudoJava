package Entities;

public class Vaga {
    public int vaga;
    public float tempo;
    public float valor;


    public Vaga(int vaga, float tempo, float valor) {
        this.vaga = vaga;
        this.tempo = tempo;
        this.valor = valor;
    }

    public void calcularValor(float tempo, float taxa) {
        valor  = tempo * taxa ;
    }
    public float getPagamento() {
        return valor;
    }

    public int getVaga() {
        return vaga;
    }

    public void setVaga(int vaga) {
        this.vaga = vaga;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "vaga=" + vaga +
                ", tempo=" + tempo +
                ", valor=" + valor +
                '}';
    }
}
