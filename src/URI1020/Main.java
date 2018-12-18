/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1020;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int day = 0;
        int month = 0;
        int year = 0;
        
        year = numero / 365;
        numero -= year * 365;
        month = numero / 30;
        numero -= month * 30;
        
        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(numero + " dia(s)");
    }
}
