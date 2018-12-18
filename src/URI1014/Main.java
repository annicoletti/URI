/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1014;

/**
 *
 * @author Administrador
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        Double gas = scan.nextDouble();
        
        Double consumption = distance / gas; 
        System.out.printf("%.3f km/l\n", consumption);
    }
}
