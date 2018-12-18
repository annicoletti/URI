/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1064;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        Double sum = 0.0;
        
        for (int i=0; i<6; i++){
            Double n = scan.nextDouble();
            if(n >= 0){
                count ++;
                sum += n;
            }
        }
        System.out.println(count + " valores positivos");
        System.out.printf("%.1f\n",(sum/count));
    }    
}