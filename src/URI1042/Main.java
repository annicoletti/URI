/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1042;

/**
 *
 * @author Administrador
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(n1);
        lista.add(n2);
        lista.add(n3);
        Collections.sort(lista);
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }    
}
