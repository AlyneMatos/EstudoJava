package Entities;

public class Cliente {

    public String name;
    public int cpf;
    public float vaga;
    public Vaga vagas;
    public float pagamento;


    public Cliente(String name, int cpf, float vaga, Vaga vagas, float pagamento) {
        this.name = name;
        this.cpf = cpf;
        this.vaga = vaga;
        this.vagas = vagas;
        this.pagamento = pagamento;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", cpf=" + cpf +
                ", vaga=" + vaga +
                ", vagas=" + vagas +
                ", pagamento=" + pagamento +
                '}';
    }
}
