/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1072;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x;
        int in =0;
        int out=0;
        for(int i=0; i<n; i++){
            x = scan.nextInt();
            if(x>=10 && x<=20){
                in++;
                //System.out.println("add in");
            }
            else{
                out++;
                //System.out.println("add out");
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
