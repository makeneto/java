import java.util.Locale;
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, metro_quadrado, Area, Preco;


        System.out.print("Digite a largura do terreno: ");
        largura = sc.nextDouble();

        System.out.print("Digite a comprimento do terreno: ");
        comprimento = sc.nextDouble();

        System.out.print("Digite valor do metro quadrado: ");
        metro_quadrado = sc.nextDouble();

        Area = largura * comprimento;
        Preco = Area  * metro_quadrado;

        System.out.println("Area do terreno = " + String.format("%.2f", Area));
        System.out.println("Preço do terreno = " + String.format("%.2f", Preco));

        sc.close();
    }
}