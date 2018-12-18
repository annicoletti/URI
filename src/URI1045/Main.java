/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1045;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double c = scan.nextDouble();
        Double t;
        
        if(a<c){
            t=a;
            a=c;
            c=t; 
        }
        if(a<b){
            t=a;
            a=b;
            b=t;
        }
        if(b<c){
            t=b;
            b=c;
            c=t;
        }
        
        if(a>=(b+c)){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{
            if(Math.pow(a, 2) == ((Math.pow(b, 2)+(Math.pow(c, 2))))){
                System.out.println("TRIANGULO RETANGULO");
            }
            if(Math.pow(a, 2) > ((Math.pow(b, 2)+(Math.pow(c, 2))))){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if(Math.pow(a, 2) < ((Math.pow(b, 2)+(Math.pow(c, 2))))){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if(a.equals(b) && a.equals(c) && b.equals(c)){
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if(a.equals(b) || a.equals(c) || b.equals(c)){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}