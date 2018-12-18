/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1046;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt(); 
        int total = 0;
        
        if (n1 == n2){
            total = 24;
        }
        else{
             while (n1 != n2){
                 total++;
                 n1++;
//                 System.out.println("TOTAL =" + total);
//                 System.out.println("N1 =" + n1);
                 if(n1 == 24){
                     n1 = 0;
                 }
             }
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n",total);        
    }
}
