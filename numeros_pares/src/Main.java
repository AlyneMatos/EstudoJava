import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeris voce vai digitar?");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i=0;i< vetor.length;i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        int quantPares = 0;
        System.out.println("NUMEROS PARES:");
        for (int i=0;i< vetor.length;i++){
            if(vetor[i]%2==0){
                System.out.println(vetor[i]);
                quantPares++; //a quantidades de vez que entra aqui quantpares acrecenta 1, é a mesma coisa que quantPares = quantPares + 1
            }
        }

        int maior = vetor[0];
        int posicao = 0;
        for (int i=0;i< vetor.length;i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                posicao = i;
            }
        }
        System.out.printf("Maior valor: %d", maior);
        System.out.printf("Posiçao do maior valor : %d", posicao);

        sc.close();

    }
}