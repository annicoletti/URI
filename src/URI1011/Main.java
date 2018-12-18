/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1011;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Double r = scan.nextDouble();
        Double volume = (4/3.0) * 3.14159 * Math.pow(r, 3);
        
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
