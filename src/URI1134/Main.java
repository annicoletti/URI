/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1134;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, g=0,a=0,d=0;
        while((n=scan.nextInt())!=4){
            switch (n){
                case 1:{a++;break;}
                case 2:{g++;break;}
                case 3:{d++;break;}                
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);
    }
}
