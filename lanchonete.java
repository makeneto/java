import java.util.Locale;
import java.util.Scanner;

public class lanchonete {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in); 

       int codigo, qtd;
       double valor_a_pagar = 0, preco;

       System.out.print("Codigo do produto comprado: ");
       codigo = sc.nextInt();
       System.out.print("Quantidade comprada: ");
       qtd = sc.nextInt();

       if (codigo == 1) {
            valor_a_pagar = 5.00;
       }
       else if (codigo == 2) {
            valor_a_pagar = 3.50;
       } 
       else if (codigo == 3) {
            valor_a_pagar = 4.80;
       }
       else if (codigo == 4) {
            valor_a_pagar = 8.90;
       }
       else if (codigo == 5) {
           valor_a_pagar = 7.32;
       }

       preco = valor_a_pagar * qtd;
       System.out.print("Valor a pagar: R$ " +String.format("%.2f", preco));

       sc.close();
    }
}