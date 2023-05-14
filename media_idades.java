import java.util.Locale;
import java.util.Scanner;

public class media_idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x, soma = 0, cout = 0;
        double media;

        System.out.println("Digite as idades: ");
        x = sc.nextInt();

        if (x < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } 
        else {
            while (x > 0) {
                cout++;
                soma = soma + x;
                 x = sc.nextInt();
            }
        }

        media = soma / cout;

        System.out.printf("MEDIA = " +String.format("%.2f", media));
        sc.close();
    }
}
