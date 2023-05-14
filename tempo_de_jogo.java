import java.util.Locale;
import java.util.Scanner;

public class tempo_de_jogo {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int Hora_inicial, Hora_final;

        System.out.print("Hora inicial: ");
        Hora_inicial = sc.nextInt();

        System.out.print("Hora final: ");
        Hora_final= sc.nextInt();

        if (Hora_inicial < Hora_final) {    
            System.out.printf("O JOGO DUROU %d HORA(S)\n", Hora_final - Hora_inicial);
        }
        else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (Hora_inicial - Hora_final));
        } 
        
        sc.close();
    }
}
