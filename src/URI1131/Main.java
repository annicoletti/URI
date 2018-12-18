/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1131;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inter=0, gremio=0, draw=0;
        boolean system = true;
        String result;
        
        while(system){
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            if(n1==n2){
                draw++;
            }
            else if(n1>n2){
                inter++;
            }
            else{
                gremio++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            int op = scan.nextInt();
            if(op==2){
                system=false;
            }
        }
        
        if(inter > gremio && inter > draw){
            result = "Inter venceu mais";
        }
        else if(gremio > inter && gremio > draw){
            result = "Gremio venceu mais";
        }
        else{
            result = "Nao houve vencedor";
        }
        
        System.out.printf("%d grenais\n",(inter+draw+gremio));
        System.out.printf("Inter:%d\n",inter);
        System.out.printf("Gremio:%d\n",gremio);
        System.out.printf("Empates:%d\n",draw);
        System.out.println(result);
    }
}
