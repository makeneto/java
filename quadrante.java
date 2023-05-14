import java.util.Locale;
import java.util.Scanner;

public class quadrante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x, y;
        
        System.out.println("Digite os valores das coordenadas X e Y: ");x=sc.nextInt();y=sc.nextInt();
        
        while(x!=0)
        {
                     if (x > 0 && y > 0) {
                    System.out.println("Quadrante Q1");
                    } 
                    else if (x < 0 && y > 0) {
                        System.out.println("Quadrante Q2");
                    }
                    else if(x < 0 && y < 0){
                        System.out.println("Quadrante Q3");
                    }
                    else if (x > 0 && y < 0) {
                        System.out.println("Quadrante Q4");
                    }
                    else if (x == 0 && y == 0) {
                        System.out.println("Origem");
                    }
                    else if (x > 0 && y == 0) {
                        System.out.println("Eixo X");
                    }
                    else if (x == 0 && y > 0) {
                        System.out.println("Eixo Y");
                    }
                  
                  System.out.println("Digite os valores das coordenadas X e Y: ");
                        x = sc.nextInt();
                        y = sc.nextInt();
                    
                }
         sc.close();
    }
}


