import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Quarto[] quarto = new Quarto[10];

        System.out.println("Quantos quartos?");
        var quantity = sc.nextInt();

        for(int i=0; i < quantity; i++){
            var name = sc.next();
            var email = sc.next();
            var room = sc.nextInt();

            quarto[room] = new Quarto(email,name);;
        }
        for (int i=0; i < 10; i++){
            System.out.println(quarto[i]);
        }
    }
}