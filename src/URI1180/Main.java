/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1180;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int index=0, number=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
               
        
        for(int i=0; i<n; i++){
            //System.out.println(list.size());
            list.add(scan.nextInt());
            //System.out.println(list.size());
            if(list.size()==1){
                number=list.get(i);
                index=i;
            }
            else{
                if(list.get(i)<number){
                    index = i;
                    number = list.get(i);
                }
            }
        }
        System.out.printf("Menor valor: %d\n",number);
        System.out.printf("Posicao: %d\n",index);
        
        //System.out.println(list);
    }    
}
