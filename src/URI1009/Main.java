/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1009;

/**
 *
 * @author Administrador
 */

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       
       String name = scan.nextLine();
       Double salary = scan.nextDouble();
       Double sales = scan.nextDouble();
       
       Double total = salary + ((sales * 15) / 100);
       
       System.out.printf("TOTAL = R$ %.2f\n", total);
        
    }
}
