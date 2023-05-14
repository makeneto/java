import java.util.Locale;
import java.util.Scanner;

/**
 * multiplos
 */
public class multiplos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        int x, y;

        System.out.println("Digite dois numeros inteiros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x % y == 0 || y % x == 0) {
            System.out.println("São multiplos.");
        } else {
            System.out.println("Não são multilos.");
        }

        sc.close();
    }
}