/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1179;

/**
 *
 * @author Administrador
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int even[] = new int[5];
        int odd[] = new int[5];
        ArrayList<Integer> listOdd = new ArrayList<Integer>();
        ArrayList<Integer> listEven = new ArrayList<Integer>();
        
        for(int i=0;i<15;i++){
            int n = scan.nextInt();
                        
            if((n%2)==0){
                if(listEven.size()<5){
                    listEven.add(n);
                }
                else{
                    for(int x=0; x<5; x++){
                        System.out.printf("par[%d] = %d\n",x,listEven.get(x));
                    }
                    listEven.clear();
                    listEven.add(n);
                }
            }
            else{
                if(listOdd.size()<5){
                    listOdd.add(n);
                }
                else{
                    for(int x=0; x<5; x++){
                        System.out.printf("impar[%d] = %d\n",x,listOdd.get(x));
                    }
                    listOdd.clear();
                    listOdd.add(n);
                }
            }            
        }
        for(int x=0; x<listOdd.size(); x++){
            System.out.printf("impar[%d] = %d\n",x,listOdd.get(x));
        }
        for(int x=0; x<listEven.size(); x++){
            System.out.printf("par[%d] = %d\n",x,listEven.get(x));
        }        
    }
}
