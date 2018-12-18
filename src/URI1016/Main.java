/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1016;

/**
 *
 * @author Administrador
 */

import java.util.*;
public class Main {
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                int km = scan.nextInt();
                Double time = km * 2.0;
                System.out.printf("%.0f minutos\n", time);
         }
}
