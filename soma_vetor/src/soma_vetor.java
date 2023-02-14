import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double soma=0, media;

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i=0; i< vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        for (int i=0; i< vetor.length; i++){
            soma = soma + vetor[i];
        }

        media = soma / n;

        System.out.println("VALORES: ");

        for (int i=0; i< vetor.length; i++){
            System.out.println(vetor[i]);
        }
        System.out.println("SOMA: " + soma);

        System.out.println("MEDIA: "+ media);
    }
}