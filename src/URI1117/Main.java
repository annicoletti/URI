/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1117;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1=0,n2=0;
        int n = 0;
        boolean whait = true; 
        while(n < 2){
            do{
                n1 = scan.nextDouble();
                if(n1>=0 && n1<=10){
                    whait = false;
                    n++;
                }
                else{
                    System.out.println("nota invalida");
                }
            }while(whait);
            
            whait = true;
            
            do{
                n2 = scan.nextDouble();
                if(n2>=0 && n2<=10){
                    whait = false;
                    n++;
                }
                else{
                    System.out.println("nota invalida");
                }
            }while(whait);            
        }
        System.out.printf("media = %.2f\n", ((double)(n1+n2)/n));
    }
}

