/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1036;

/**
 *
 * @author A
public cldministrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double c = scan.nextDouble();
        
        //b2 - 4 . a .c 
        Double delta = Math.pow(b, 2) - ( 4 * a * c);
        Double r1,r2;
        if(delta<0 || (2*a) == 0){
            System.out.println("Impossivel calcular");
        }
        else{
            // r1 = -b +- raiz delta / 2 . a
            r1 = ((-(b))+Math.sqrt(delta))/(2*a);
            r2 = ((-(b))-Math.sqrt(delta))/(2*a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }    
}
