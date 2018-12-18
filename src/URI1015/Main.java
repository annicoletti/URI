/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1015;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double x1 = scan.nextDouble();
        Double y1 = scan.nextDouble();
        Double x2 = scan.nextDouble();
        Double y2 = scan.nextDouble();
        
        Double distance = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        
        System.out.printf("%.4f\n",distance);
    }
}
