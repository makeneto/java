import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        double soma = 0, media;
        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        double[] vet = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < N; i++) {
            System.out.printf(vet[i] +" ");
            soma = soma + vet[i];
        }

        media = soma / N;
        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}
