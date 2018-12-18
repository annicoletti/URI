/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1073;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Double pow=0.0;
        for(int i=2; i<=n; i+=2){
            pow = Math.pow(i,2);
            System.out.printf("%d^2 = %.0f\n", i, pow);
        }        
    }
}
