/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1173;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] vetor = new int[10];
        for(int i=0; i<10; i++){
            if(i==0){
                vetor[i] = n;
            }
            else{
                vetor[i] = vetor[i-1]*2;
            }
            System.out.printf("N[%d] = %d\n",i,vetor[i]);
        }
    }
}
