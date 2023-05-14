import java.util.Locale;
import java.util.Scanner;

public class senha_fixa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha_fixa;

        System.out.print("Digite a senha: ");
        senha_fixa = sc.nextInt();

        while (senha_fixa != 2005) {
            System.out.print("Senha Invalida! Tente novamente: ");
            senha_fixa = sc.nextInt();
        }

        System.out.println("Acesso permitido! ");

        sc.close();
    }
}
