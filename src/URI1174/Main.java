/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1174;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetor = new double[100];
        for(int i=0;i<100;i++){
            vetor[i]=scan.nextDouble();
            if(vetor[i]<=10){
                System.out.printf("A[%d] = %.1f\n",i,vetor[i]);
            }
        }
    }
}
