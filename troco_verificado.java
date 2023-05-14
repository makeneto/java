import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner mk = new Scanner(System.in);
        double preco, dinheiro_recebido, Troco;
        int qtd;

        System.out.print("Preço unitário do produto: ");
        preco = mk.nextDouble();

        System.out.print("Quantidade comprada: ");
        qtd = mk.nextInt();

        System.out.print("Dinheiro recebido: ");
        dinheiro_recebido = mk.nextDouble();

        if (preco * qtd > dinheiro_recebido) {
            System.out.print("DINHEIRO INSUFICIENTE. FALTAM 20.00 REAIS");
        }
        else{

            Troco = dinheiro_recebido - (preco * qtd);
            
            System.out.print("TROCO = " +String.format("%.2f", Troco));
        }
        mk.close();
    }
}
