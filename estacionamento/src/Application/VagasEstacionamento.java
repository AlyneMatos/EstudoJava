package Application;

import Entities.Cliente;
import Entities.Vaga;

import java.util.Scanner;

public class VagasEstacionamento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vaga[] vagas = new Vaga[20];

        int n = 0;

        do{
            System.out.println("========== Cliente ========== ");
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("CPF: ");
            int cpf = sc.nextInt();

            System.out.println("Tempo: ");
            float tempo = sc.nextFloat();

            System.out.println("Vaga: ");
            int vaga = sc.nextInt();

            float valor = 10;
            Vaga pagamento = new Vaga(vaga,tempo,valor);
            pagamento.calcularValor(tempo, valor);
            System.out.println(pagamento.getPagamento());

            vagas[vaga] = new Vaga(vaga,tempo,valor);
            Cliente cliente = new Cliente(nome,cpf,vaga,vagas[vaga],pagamento.getPagamento());

            System.out.println(vagas[vaga]);
            System.out.println(cliente);

            System.out.println("\nAdicionar um cliente a uma vaga (1) ");
            System.out.println("Sair (0)");
            int num = sc.nextInt();
            if(num == 0){
                break;
            }

        }while (n!=0);

    }
}