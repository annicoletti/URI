/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1159;

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
            int sum=0;
            if(n%2!=0){
                n++;
            }
            for(int i=0; i<5; n++){
                if(n%2==0){
                    sum += n;
                    i++;
                }                
            }
            System.out.println(sum);
        }        
    }
}
