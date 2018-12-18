/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1047;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h1 = scan.nextInt();
        int m1 = scan.nextInt();
        int h2 = scan.nextInt();
        int m2 = scan.nextInt();
        int totalHoras =0;
        int totalMinutos =0;
        
        
        if(h1==h2 && m1==m2){
            totalHoras = 24;
            totalMinutos = 0;
        }
        else{
             while (h1 != h2 || m1 != m2){
                 totalMinutos++;
                 m1++;
                 //System.out.printf("M1: %d e TMIN: %d\n",m1,totalMinutos);
                 if(m1 == 60){
                     m1 = 0;
                     h1++;                     
                     //System.out.println("TH: " + totalHoras);
                     if(h1 == 24){
                         h1 = 0;
                     }
                 }
                 if(totalMinutos ==60){
                     totalMinutos = 0;
                     totalHoras++;
                 }
             }
        }
        System.out.println("O JOGO DUROU "+totalHoras+" HORA(S) E "+totalMinutos+" MINUTO(S)");
    }
}
