/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1116;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        int n = scan.nextInt();
        for (int i=0; i<n; i++){
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            if(num2 == 0){
                System.out.println("divisao impossivel");
            }
            else{
                System.out.printf("%.1f\n",((double)num1/num2));
            }
        }
    }
}
