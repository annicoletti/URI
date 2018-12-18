/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1013;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int maior = (a+b+Math.abs(a-b))/2;
        maior = (maior+c+Math.abs(maior-c))/2;
        System.out.println(maior + " eh o maior");
    }    
}
