/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1021;

/**
 *
 * @author Administrador
 */

import java.util.Scanner;
public class MainOld1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float valor = scan.nextFloat();
        int n100=0,n50=0,n20=0,n10=0,n5=0,n2=0,m1=0,m50=0,m25=0,m10=0,m05=0,m01=0;
       
        while (valor >= 0.009){
            if(valor >= 100){
                valor -= 100;
                n100++;
            }
            else if(valor >= 50){
                valor -= 50;
                n50++;
            }
            else if(valor >= 20){
                valor -= 20;
                n20++;
            }
            else if(valor >= 10){
                valor -= 10;
                n10++;
            }
            else if(valor >= 5){
                valor -= 5;
                n5++;
            }
            else if(valor >= 2){
                valor -= 2;
                n2++;
            }
            else if(valor >= 1){
                valor -= 1;
                m1++;
            }
            else if(valor >= 0.50){
                valor -= 0.50f;
                m50++;
            }
            else if(valor >= 0.25){
                valor -= 0.25f;
                m25++;
            }
            else if(valor >= 0.10){
                valor -= 0.10f;
                m10++;
            }
            else if(valor >= 0.05){
                valor -= 0.05f;
                m05++;
            }
            else if(valor >= 0.01){
                valor -= 0.01f;
                m01++;                
            }
        }
               
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", n100);
        System.out.printf("%d nota(s) de R$ 50.00\n", n50);
        System.out.printf("%d nota(s) de R$ 20.00\n", n20);
        System.out.printf("%d nota(s) de R$ 10.00\n", n10);
        System.out.printf("%d nota(s) de R$ 5.00\n", n5);
        System.out.printf("%d nota(s) de R$ 2.00\n", n2);
        System.out.println("NOTAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", m1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", m50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", m25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", m10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", m05);
        System.out.printf("%d moeda(s) de R$ 0.01\n", m01);
    }
}
