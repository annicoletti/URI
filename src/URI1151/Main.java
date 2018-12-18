/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1151;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("0 ");
        for(int i=1, n1=0, n2=1; i<n; i++){
            int temp = n1 + n2;
            n2 = n1;
            n1 = temp;
            System.out.print(temp);
            if(i!=(n-1)){
                System.out.print(" ");
            }
            else{
                System.out.print("\n");
            }
        }
    }
}
