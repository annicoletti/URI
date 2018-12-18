/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1101;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1,n2,sum=0;
        String resp="";
        while(((n1=scan.nextInt())>0) && ((n2=scan.nextInt())>0)){
            if(n1>n2){
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            if(n1>0 && n2>0){
                for(int i=n1; i<=n2; i++){
                    sum += i;
                    resp += i+" ";
                }
                resp += "Sum="+sum+"\n";
                sum=0;
            }
        }
        System.out.print(resp);
    }
}
