package Application;

import Entities.Alturas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();
        Alturas[] vetor = new Alturas[n];

        for (int i = 1; i <= vetor.length; i++) {
            System.out.println("Dados da " + i + " pessoa: ");
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new Alturas(nome, idade, altura);
        }

        double sum = 0.0;
        for (int i = 1; i <= vetor.length; i++) {
            sum += vetor[i].getAltura();
        }
        double media = sum / vetor.length;
        System.out.println("Altura media: "+ media);

        double idadeMaior = 0.0;
        for (int i = 1; i <= vetor.length; i++) {
            if (vetor[i].getIdade() < 16){
                idadeMaior += vetor[i].getIdade();
            }
        }

        double porcentagem = idadeMaior / n;
        System.out.println("Pessoas com menos de 16 anos: "+porcentagem );

        for (int i = 0; i < n; i++){
            System.out.println(vetor[i].getNome());
        }
        sc.close();
    }
}