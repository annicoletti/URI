/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1099;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public interface Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int sum =0;
        int n = scan.nextInt();
        int[] r = new int[n];
        for(int i=0; i<n; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(x>y){
                int t=x;
                x = y;
                y = t;
            }
            x++;
            while (x < y){
                if((x%2)==0){
                x++;
                }
                else{
                    sum += x;
                    x++;
                }
            }
        r[i]=sum;
        sum=0;
        }
        for(int i=0; i<r.length; i++){
            System.out.println(r[i]);
        }
    }
}
