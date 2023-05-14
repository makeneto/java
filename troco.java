import java.util.Locale;
import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtde;
        double preco, troco, dinheiro_recebido;

        System.out.print("Preco unitário do produto: ");
        preco = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        qtde = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        dinheiro_recebido = sc.nextDouble();

        troco = dinheiro_recebido - (preco * qtde);

        System.out.println("TROCO = " +String.format("%.2f", troco));

        sc.close();
    }
}
