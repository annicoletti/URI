/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1070;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
        int n = scan.nextInt();
        int printed = 0;
        if(n%2 != 0){
            System.out.println(n);
            printed++;
        }
        else{
            n--;
        }
        while(printed < 6){
            n += 2;
            System.out.println(n);
            printed++;
        }
    }
}
