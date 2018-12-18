/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1143;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (double i=1; i<=n; i++){
            System.out.printf("%.0f %.0f %.0f\n", i, (Math.pow(i, 2)), (Math.pow(i, 3)));
        }
    }
}
