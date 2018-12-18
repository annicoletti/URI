/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1150;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0, i;
        int n1 = scan.nextInt();
        int n2;
        while((n2=scan.nextInt())<=n1){}
        for(i=0;sum<=n2;i++){
            sum += n1;
            n1++;
        }
        System.out.println(i);
    }
}
