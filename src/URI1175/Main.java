/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1175;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] matriz = new int[20];
        for(int j=19; j>=0; j--){
            matriz[j] = scan.nextInt();
        }        
        for(int i=0; i<(matriz.length); i++){
            System.out.printf("N[%d] = %d\n",i,matriz[i]);
        }
    }
}
