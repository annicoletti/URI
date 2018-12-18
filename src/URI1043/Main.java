/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1043;

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
        
        
        if(Math.abs(b - c) < a && (b+c) > a){
            if(Math.abs(a-c)<b && (a+c)>b){
                if(Math.abs(a-b)<c && (a+b)>c){
                     System.out.printf("Perimetro = %.1f\n", (a+b+c));
                }
            }
        }
        else{
            System.out.printf("Area = %.1f\n",((c*(a+b))/2));
        }
    }
}
