package Entities;

public class Client {
    public String nome;
    public int cpf;
    public String email;
    public String endereco;
    public int numero;
    public int cep;

    public Client(String nome,int cpf, String email, String endereco, int numero, int cep){
        nome = this.nome;
        cpf = this.cpf;
        email = this.email;
        endereco = this.endereco;
        numero = this.numero;
        cep = this.cep;
    }
}
