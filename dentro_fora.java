import java.util.Locale;
import java.util.Scanner;

public class dentro_fora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, x, dentro = 0, fora = 0;
        
        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                dentro++;
            } 
            else if (x < 10 || x > 20) {
               fora++; 
            }
        }

        System.out.printf("%d DENTRO\n", dentro);
        System.out.printf("%d FORA\n", fora);

        sc.close();
    }
}
