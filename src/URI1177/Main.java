/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1177;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int vetor[] = new int[1000];
        
        for(int i=0, j=0; i<1000; i++,j++){
            vetor[i]=j;
            System.out.printf("N[%d] = %d\n",i,vetor[i]);
            if(j==(n-1)){
                //System.out.println("N-1 = " + (n-1));
                j=-1;
            }
        }
    }
}
