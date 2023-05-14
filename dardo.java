import java.util.Locale;
import java.util.Scanner;

public class dardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, maior = 0;

        System.out.println("Digite as tres distancias: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        }
        else if (n2 > n1 && n2 > n3) {
            maior = n2;
        }
        else{
            maior = n3;
        }

        System.out.println("MAIOR DISTANCIA = " +String.format("%.2f", maior));
        
        sc.close();
    }
}
