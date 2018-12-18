/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1079;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        double[] notas = new double[n];
        
        for(int i=0; i<n; i++){
            Double n1 = scan.nextDouble();
            Double n2 = scan.nextDouble();
            Double n3 = scan.nextDouble();
            notas[i] = ((n1*2)+(n2*3)+(n3*5))/10;
        }
        
        for(int i=0; i<notas.length; i++){            
            System.out.printf("%.1f\n",notas[i]);
        }
    }
}
