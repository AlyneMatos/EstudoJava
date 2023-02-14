import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chute, nivel;
        int tentativas;

            menu();

            Scanner dificuldade = new Scanner(System.in);
            nivel = dificuldade.nextInt();
            tentativas = QuantTentativas(nivel);

            Random gerador = new Random();
            int numerosecreto = gerador.nextInt(100);

            Scanner numero = new Scanner(System.in);
            for (int i = 1; i <= tentativas; i++) {

                System.out.print("Digite o seu chute: ");
                chute = numero.nextInt();

                if (chute == numerosecreto) {
                    ganhar();
                    break;
                } else {
                    perder();
                    if (chute < numerosecreto) {
                        System.out.println("Chute menor que numero secreto!");
                    } else {
                        System.out.println("Chute maior que numero secreto!");
                    }
                }
            }
        System.out.printf(" O numero secreto é %d", numerosecreto);
    }

    public static void menu() {
        System.out.println("Informe o nivel de dificuldade");
        System.out.println("1 - facil");
        System.out.println("2 - medio");
        System.out.println("3 - dificil");
    }

    public static int QuantTentativas(int valor) {
        int tentativas;

        switch (valor) {
            case 1:
                tentativas = 15;
                break;
            case 2:
                tentativas = 20;
                break;
            default:
                tentativas = 25;
                break;
        }
        return tentativas;
    }

    public static void ganhar() {

        System.out.println("             OOOOOOOOOOO               \n");
        System.out.println("         OOOOOOOOOOOOOOOOOOO           \n");
        System.out.println("      OOOOOO  OOOOOOOOO  OOOOOO        \n");
        System.out.println("    OOOOOO      OOOOO      OOOOOO      \n");
        System.out.println("  OOOOOOOO  #   OOOOO  #   OOOOOOOO    \n");
        System.out.println(" OOOOOOOOOO    OOOOOOO    OOOOOOOOOO   \n");
        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  \n");
        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  \n");
        System.out.println("OOOO  OOOOOOOOOOOOOOOOOOOOOOOOO  OOOO  \n");
        System.out.println(" OOOO  OOOOOOOOOOOOOOOOOOOOOOO  OOOO   \n");
        System.out.println("  OOOO   OOOOOOOOOOOOOOOOOOOO  OOOO    \n");
        System.out.println("    OOOOO   OOOOOOOOOOOOOOO   OOOO     \n");
        System.out.println("      OOOOOO   OOOOOOOOO   OOOOOO      \n");
        System.out.println("         OOOOOO         OOOOOO         \n");
        System.out.println("             OOOOOOOOOOOO              \n");
        System.out.println("\nParabéns! Você acertou!\n");
        System.out.println("Voce acertou!!");

    }

    public static void perder() {
        System.out.println("       \\|/ ____ \\|/    \n");
        System.out.println("        @~/ ,. \\~@      \n");
        System.out.println("       /_( \\__/ )_\\    \n");
        System.out.println("          \\__U_/        \n");

        System.out.println("\nVocê perdeu! Tente novamente!\n\n");
    }
}
