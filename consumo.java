import java.util.Locale;
import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int distancia;
        double combustivel_gasto, consumo_medio;


        System.out.print("Distância percorrida: ");
        distancia = sc.nextInt();

        System.out.print("Combustível gasto: ");
        combustivel_gasto = sc.nextDouble();

        consumo_medio = distancia / combustivel_gasto;

        System.out.print("Consumo medio = " +String.format("%.3f", consumo_medio));

        sc.close();
    }
}
