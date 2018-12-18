/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1006;

/**
 *
 * @author Administrador
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double c = scan.nextDouble();
        
        Double average = ((a*2) + (b*3) + (c*5)) / 10;
        
        System.out.printf("MEDIA = %.1f\n", average);
    }
}
