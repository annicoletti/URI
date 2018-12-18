/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1132;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        
        if(n1>n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        
        while(n1<=n2){
            if((n1%13)!=0){
                sum+=n1;
            }
            n1++;
        }
        System.out.println(sum);
    }
}
