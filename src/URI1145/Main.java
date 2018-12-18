/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1145;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador=1;
        int col = scan.nextInt();
        int total = scan.nextInt();
        for(int i=1,j=1; i<=total ;i++,j++){
            if(j<col){
                if(i!=total){
                    System.out.print(i+" ");
                }
                else{                    
                    System.out.print(i+"\n");
                }
            }
            else if(j<=col){
                System.out.print(i+"\n");
                j=0;            
            }
        }
    }    
}
