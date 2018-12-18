/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1118;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class MainOld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double n1=0,n2=0,average=0;
        int option=1,n=0;
        boolean whait = true;
        
        while(option==1){
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
                average = (n1+n2) /2;
            }
            System.out.printf("media = %.2f\n", average);
            System.out.println("novo calculo (1-sim 2-nao)");
            n=0;
            option=scan.nextInt();
            while(option != 1 && option != 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                option=scan.nextInt();
            }            
        }
    }
}
