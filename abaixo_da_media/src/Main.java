import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter no vetor?");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        double soma=0.0;
        for(int i=0;i< vetor.length;i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        double media = soma / n;
        System.out.println("MEDIA DO VETOR: " + media);

    }
}