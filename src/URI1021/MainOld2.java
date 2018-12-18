/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1021;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class MainOld2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        
        int nota = 0;
        int moeda = 0;
        
        nota = (int) valor;
        moeda = (int) ((valor - nota) * 100);
        
        System.out.println("NOTA: " + nota + "\nMoeda: " + moeda);
        
        
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", (int)(valor/100));
        System.out.printf("%d nota(s) de R$ 50.00\n", (int)(valor%100/50));
        System.out.printf("%d nota(s) de R$ 20.00\n", (int)(valor%100%50/20));
        System.out.printf("%d nota(s) de R$ 10.00\n", (int)(valor%100%50%20/10));
        System.out.printf("%d nota(s) de R$ 5.00\n", (int)(valor%100%50%20%10/5));
        System.out.printf("%d nota(s) de R$ 2.00\n", (int)(valor%100%50%20%10%5/2));
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", (int)(valor%100%50%20%10%5%2/1));
        System.out.printf("%d moeda(s) de R$ 0.50\n", (int)(valor%100%50%20%10%5%2%1/0.50));
        System.out.printf("%d moeda(s) de R$ 0.25\n", (int)(valor%100%50%20%10%5%2%1%0.50/0.25));
        System.out.printf("%d moeda(s) de R$ 0.10\n", (int)(valor%100%50%20%10%5%2%1%0.50%0.25/0.10));
        System.out.printf("%d moeda(s) de R$ 0.05\n", (int)(valor%100%50%20%10%5%2%1%0.50%0.25%0.10/0.05));
        System.out.printf("%d moeda(s) de R$ 0.01\n", (int)(valor%100%50%20%10%5%2%1%0.50%0.25%0.10%0.05/0.01));
    }
}
