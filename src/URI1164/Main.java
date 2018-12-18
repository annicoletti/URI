/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1164;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int perfect;
        int cases = scan.nextInt();
        for(int i=0; i<cases; i++){
            int verify=0;
            perfect = scan.nextInt();
            for(int j=1; j<perfect; j++ ){
                if(perfect%j==0){
                    verify += j;
                }
            }
            if(verify == perfect){
                System.out.println(perfect + " eh perfeito");
            }
            else{
                System.out.println(perfect + " nao eh perfeito");
            }
        }
    }
}
