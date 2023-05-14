import java.util.Locale;
import java.util.Scanner;

public class experiencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, qtd_cobaias, total, total_coelhos = 0, total_ratos = 0, total_sapos = 0;
        double Porcentual_de_coelhos, Porcentual_de_ratos, Porcentual_de_sapos;
        char tipo_de_cobaias;

        //--------Entrada de dados.

        System.out.print("Quantos casos de teste serao digitados? ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Quantidade de cobaias: ");
            qtd_cobaias = sc.nextInt();

            System.out.print("Tipo de cobaias: ");
            tipo_de_cobaias = sc.next().charAt(0);

            if (tipo_de_cobaias == 'C') {
                total_coelhos = total_coelhos + qtd_cobaias;
            }
            else if (tipo_de_cobaias == 'R') {
                total_ratos = total_ratos + qtd_cobaias;
            }
            else if (tipo_de_cobaias == 'S') {
                total_sapos = total_sapos + qtd_cobaias;
            }
        }

        //------Proccessamento de dados.

        total = total_coelhos + total_ratos + total_sapos;

        Porcentual_de_coelhos = (total_coelhos / total) * 100;

        Porcentual_de_sapos = (total_sapos / total) * 100;

        Porcentual_de_ratos = (total_ratos / total) * 100;

        //------Saída de dados

        System.out.printf("\nRELATORIO FINAL:\n");
        
        System.out.printf("Total: %d cobaias\n", total);
        
        System.out.printf("Total de coelhos: %d\n", total_coelhos);

        System.out.printf("Total de ratos: %d\n", total_ratos);

        System.out.printf("Total de sapos: %d\n", total_sapos);

        System.out.printf("Porcentual de coelhos: %.2f\n", Porcentual_de_coelhos);

        System.out.printf("Porcentual de ratos: %.2f\n", Porcentual_de_ratos);

        System.out.printf("Porcentual de sapos: %.2f\n", Porcentual_de_sapos);
        sc.close();
    }
}
