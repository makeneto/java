import java.util.Locale;
import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor_por_hora, devido_salario;
        int horas_trabalhadas;

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Valor por hora: ");
        valor_por_hora = sc.nextDouble();

        System.out.print("Horas trabalhadas: ");
        horas_trabalhadas = sc.nextInt();

        devido_salario = valor_por_hora * horas_trabalhadas;

        System.out.print("O pagamento para " +nome+ " deve ser " +String.format("%.2f", devido_salario));

        sc.close();
    }
}
