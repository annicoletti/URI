/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1061;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d1,h1,m1,s1;
        int d2,h2,m2,s2;
        
        scan.next(); d1 = scan.nextInt();
        h1 = scan.nextInt(); scan.next(); m1 = scan.nextInt(); scan.next(); s1 = scan.nextInt();
        scan.next(); d2 = scan.nextInt();
        h2 = scan.nextInt(); scan.next(); m2 = scan.nextInt(); scan.next(); s2 = scan.nextInt(); 
        
        int seconds1 = (d1*86400) + (h1*3600) + (m1*60) + s1;
        int seconds2 = (d2*86400) + (h2*3600) + (m2*60) + s2;
        
        int amountTime = seconds2 - seconds1;
        
        int t = 0;
        int s = 0;
        int m = 0;
        int h = 0;
        int d = 0;
        
        while (t != amountTime){
            t++;
            s++;
            if(s==60){
                m++;
                s=0;
            }
            if(m==60){
                m=0;
                h++;
            }
            if(h==24){
                h=0;
                d++;
            }            
        }        
        System.out.println(d + " dia(s)");
        System.out.println(h + " hora(s)");
        System.out.println(m + " minuto(s)");
        System.out.println(s + " segundo(s)");
    }
}
