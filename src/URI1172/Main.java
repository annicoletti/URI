/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1172;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];
        for(int i=0; i<10; i++){
            vetor[i] = scan.nextInt();
            if(vetor[i]<=0){
                vetor[i] = 1;
            }
        }
        for(int i=0; i<vetor.length; i++){
            System.out.println("X["+i+"] = "  + vetor[i]);
        }
    }
}
