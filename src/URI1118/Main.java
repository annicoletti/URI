/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1118;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double n1=0, n2=0, media=0;
        boolean system = true;
        
        while(system){
            do{
                n1=scan.nextDouble();
                if(n1<0 || n1>10){
                    System.out.println("nota invalida");
                }
            }while(n1<0 || n1>10);

            do{
                n2=scan.nextDouble();
                if(n2<0 || n2>10){
                    System.out.println("nota invalida");
                }
            }while(n2<0 || n2>10);

            media = (n1+n2)/2;        
            System.out.printf("media = %.2f\n",media);
            System.out.println("novo calculo (1-sim 2-nao)");
            
            int n;
            boolean wait=true;
            while(wait){
                n = scan.nextInt();
                if(n == 1){
                    wait=false;
                }
                else if(n==2){
                    wait=false;
                    system=false;
                }
                else{
                    System.out.println("novo calculo (1-sim 2-nao)");
                }
            }       
        }
    }    
}
