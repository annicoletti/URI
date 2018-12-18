/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1041;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double X = scan.nextDouble();
        Double Y = scan.nextDouble();
        if(X == 0 && Y==0){
            System.out.println("Origem");
        }
        else if(X==0 && Y!=0){
            System.out.println("Eixo Y");
        }
        else if(X!=0 && Y==0){
            System.out.println("Eixo X");
        }
        else if(X>0 && Y>0){
            System.out.println("Q1");
        }
        else if(X<0 && Y>0){
            System.out.println("Q2");
        }
        else if(X<0 && Y<0){
            System.out.println("Q3");
        }
        else{
            System.out.println("Q4");
        }
    }
}
