/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1177;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
            int T, i,j;
            int N[] =new int[1000];
            Scanner input =new Scanner(System.in);
            T =input.nextInt();


            for ( i = 0,j = 0; i < 1000; j++,i++) {
                    N[j] =  j;
                    if ((N[j]) == T) {
                            j = 0;
                    }
                    System.out.print("N["+i+"] = "+N[j]+"\n");
            }
    }
}
