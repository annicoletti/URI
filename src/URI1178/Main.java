/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1178;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lista[] = new double[100];
        double n=scan.nextDouble();
        lista[0]=n;
        for(int i=1; i<lista.length; i++){
            lista[i] = (lista[i-1] / 2);
        }
        for(int i=0; i<lista.length; i++){
            System.out.printf("N[%d] = %.4f\n",i,lista[i]);
        }
    }
}
