import java.util.Locale;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        int x, resultado;

        System.out.print("Deseja a tabuada para qual valor? ");
        x = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            resultado = x * i;
            System.out.printf("%d x %d = %d\n", x, i, resultado);
        }

        sc.close();
    }
}
