/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1165;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int cases = scan.nextInt();
        for(int i=0;i<cases;i++){
            number = scan.nextInt();
            int div = 0;
            for(int j=2;j<number;j++){
                if(number%j==0){                    
                    div = 1;
                    j = number;
                }
            }
            if(div==1){
                System.out.println(number + " nao eh primo");
            }
            else {
                System.out.println(number + " eh primo");
            }
        }
    }
}
