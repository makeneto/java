import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        double media, soma = 0;
        System.out.print("Quantas pessoas serao digitadas? ");
        N = sc.nextInt();

        String[] nome = new String[N];
        int[] idade = new int[N];
        double[] alturas = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.printf("Dados da " +(i+1)+"a Pessoa:\n");

            System.out.print("Nome: ");
            sc.nextLine(); //-----limpeza de buffer
            nome[i] = sc.nextLine();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();

            soma = soma + alturas[i];
        }
        System.out.printf("\nAltura média: %.2f", media = soma / N);
        sc.close();
    }
}
