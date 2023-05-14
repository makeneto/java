import java.util.Locale;
import java.util.Scanner;


public class media_ponderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        double a, b, c, media;

        System.out.print("Quantos casos voce vai digitar? ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Digite tres numeros: ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            media = (a + b + c) / 3;
            System.out.printf("MEDIA = %.1f\n", media);
        }

        sc.close();
    }
}