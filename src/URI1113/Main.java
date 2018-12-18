/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1113;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1,n2;
        while((n1=scan.nextInt())!=(n2=scan.nextInt()))
            if(n1>n2){
                System.out.println("Decrescente");
            }
            else{
                System.out.println("Crescente");
            }
    }
}
