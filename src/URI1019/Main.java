/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1019;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        int hours = 0;
        int minutes = 0;

        hours = (time / 60) / 60;
        time -= hours * 60 * 60;
        minutes = (time / 60);
        time -= minutes * 60;
        
        System.out.printf("%d:%d:%d\n",hours,minutes,time);
    }
}
