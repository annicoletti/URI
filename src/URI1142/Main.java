/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1142;



/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num =1;
        for (int i=n; i>0; i--){
            for(int j=1; j<=3; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println("PUM");
            num++;
        }
    } 
}
