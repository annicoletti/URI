/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1158;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int sum = 0;
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            
            if(n1%2==0){
                n1++;
            }
            for(int j=0; j<n2; j++, n1+=2){
                sum += n1;             
            }
            System.out.println(sum);
        }
    }
}
