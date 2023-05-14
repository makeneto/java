import java.util.Locale;
import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1, n2, nota;
        System.out.print("Digite a primeria nota: ");
        n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextDouble();

        nota = n1 + n2;

        System.out.println("NOTA FINAL = " +String.format("%.1f", nota));

        if (nota < 60.00) {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
