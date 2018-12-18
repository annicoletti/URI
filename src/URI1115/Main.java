/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1115;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y;
        while((x=scan.nextInt())!=0 && (y=scan.nextInt())!=0){
            if(x>0 && y>0){
                System.out.println("primeiro");
            }
            else if(x<0 && y>0){
                System.out.println("segundo");
            }
            else if(x<0 && y<0){
                System.out.println("terceiro");
            }
            else{
            System.out.println("quarto");
            }
        }
    }
}
