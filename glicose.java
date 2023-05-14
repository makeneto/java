import java.util.Locale;
import java.util.Scanner;

public class glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double glicose;

        System.out.print("Digite a medida da glicose: ");
        glicose = sc.nextDouble();

        System.out.print("Classificacao: ");
        if (glicose <= 100) {
            System.out.print("Normal");
        } 
        else if (glicose <= 140) {
            System.out.print("Elevado");
        }
        else {
           System.out.print("Diabetes"); 
        }

        sc.close();
    }
}
