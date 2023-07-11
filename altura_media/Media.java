import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String name = JOptionPane.showInputDialog("Quantidade de pessoas:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de pessoas:"));
        double[] vect = new double[quantity];

        for (int i=0;i<quantity;i++){
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura do " +(i+1)+ "ª individuo: "));
            vect[i] = altura;
        }
        double sum = 0.0;
        for (int i=0;i<quantity;i++){
            sum = sum + vect[i];
        }
        double media = sum/quantity;
        String message = String.format("\nA media das alturas é "+media+".");
        JOptionPane.showMessageDialog(null,message);

    }
}

