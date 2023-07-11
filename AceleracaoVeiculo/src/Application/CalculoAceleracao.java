package Application;

import Entities.Acelerecao;


import java.util.Scanner;

public class CalculoAceler
        acao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Acelerecao velocidade1, velocidade2; //as variaveis é do tipo Aceleracao

        velocidade1 = new Acelerecao(); //instancia das variaveis. As variaveis aponta para os atributos da classe Aceleracao no caso a,b e c
        velocidade2 = new Acelerecao();// velociadade1 e velocidade2 sao objetos visto que é uma instancia da classe Aceleracao

        System.out.println("Veiculo 1:");
        System.out.println("Tempo?");
        velocidade1.tempo = sc.nextDouble();
        System.out.println("Velocidade?");
        velocidade1.velocidade = sc.nextDouble();

        System.out.println("Veiculo 2:");
        System.out.println("Tempo?");
        velocidade2.tempo = sc.nextDouble();
        System.out.println("Velocidade?");
        velocidade2.velocidade = sc.nextDouble();

        double aceleracao1 = velocidade1.acelerecao();
        double aceleracao2 = velocidade2.acelerecao();

        System.out.println("Acelerção veiculo 1:" + aceleracao1);
        System.out.println("Acelerção veiculo 1:" + aceleracao2);
    }
}