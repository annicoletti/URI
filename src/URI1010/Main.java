/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1010;

/**
 *
 * @author Administrador
 */
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int prod1 = scan.nextInt();
        int numb1 = scan.nextInt();
        Double value1 = scan.nextDouble();
        
        int prod2 = scan.nextInt();
        int numb2 = scan.nextInt();
        Double value2 = scan.nextDouble();
        
        Double amount = (numb1*value1) + (numb2*value2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",amount);
        
    }
}
