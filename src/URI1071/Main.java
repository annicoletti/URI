/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1071;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int sum = 0;
        if(n1>n2){
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }
        n1++;
        while (n1 < n2){
            if((n1%2)==0){
            n1++;
            }
            else{
                sum += n1;
                n1++;
            }
        }
        System.out.println(sum);
    }
}
