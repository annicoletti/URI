/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1037;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double n = scan.nextDouble();
        if(n >=0 && n <= 25){
            System.out.println("Intervalo [0,25]");
        }
        else if(n>25 && n<=50){
            System.out.println("Intervalo (25,50]");
        }
        else if(n>50 && n<=75){
            System.out.println("Intervalo (50,75]");
        }
        else if(n>75 && n<=100){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }            
    }
}
