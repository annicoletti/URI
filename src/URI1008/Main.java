/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1008;

/**
 *
 * @author Administrador
 */

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
    
        int number = scan.nextInt();
        int hours = scan.nextInt();
        Double hourValue = scan.nextDouble();

        Double salary = hours * hourValue;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        
    }   
}
