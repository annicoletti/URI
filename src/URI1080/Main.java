/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1080;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bigger=0;
        int position=0;
        
        for (int i=1;i<=100;i++){
            int temp = scan.nextInt();
            if(temp>bigger){
                bigger = temp;
                position = i;
            }
        }
        System.out.println(bigger);
        System.out.println(position);
    }
}
