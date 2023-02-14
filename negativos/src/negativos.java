import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int number = sc.nextInt();
        int[] vect = new int[number];

        for (int i=0; i< vect.length; i++){
            //sc.nextBoolean();
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i=0; i< vect.length; i++){
            if(vect[i]<0) {
                System.out.println(vect[i]);
            }
        }

    }
}