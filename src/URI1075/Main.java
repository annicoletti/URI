/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1075;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=10000; i++){
            if((i%n)==2){
                System.out.println(i);
            }
        }
    }    
}
