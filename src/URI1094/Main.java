/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1094;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        int total = 0;
        int c = 0;
        int r = 0;
        int s = 0;
        
        for(int i=0;i<qtd;i++){
            int n = scan.nextInt();
            String t = scan.next();
            switch(t){
                case "C":{c+=n;break;}
                case "R":{r+=n;break;}
                case "S":{s+=n;break;}
            }
            total +=n;
        }
        
        System.out.printf("Total: %d cobaias\n",total);
        System.out.printf("Total de coelhos: %d\n",c);
        System.out.printf("Total de ratos: %d\n",r);
        System.out.printf("Total de sapos: %d\n",s);
        System.out.printf("Percentual de coelhos: %.2f %%\n",(c*100.0)/total);
        System.out.printf("Percentual de ratos: %.2f %%\n",(r*100.0)/total);
        System.out.printf("Percentual de sapos: %.2f %%\n",(s*100.0)/total);
      }
}
