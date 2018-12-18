/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1146;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        
        while((n=scan.nextInt())!=0){
            for (int i=1; i<=n; i++) {
                if(i==n){
                    System.out.println(i);
                }
                else{
                    System.out.print(i+" ");
                }
            }
        }
    }
}
