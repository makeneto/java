import java.util.Locale;
import java.util.Scanner;

public class numeros_primos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numPrimo, numDivisores = 0;

        System.out.println("Digite um numero: ");
        numPrimo = sc.nextInt();

        for (int i = 1; i < numPrimo; i++) {
            if (numPrimo % i == 0) {
                numDivisores++;
            }
        }

        if (numDivisores == 2) {
            System.out.println("O numero digitado é primo.");
        } 
        else {
            System.out.println("O numero digitado não é primo.");
        }

        sc.close();
    }
    
}