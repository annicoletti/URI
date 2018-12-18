/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1097;

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args) {
        int x = 7;
        for(int i=1; i<=9; i+=2){
            for(int j=x; j>=x-2; j--){
                System.out.printf("I=%d J=%d\n",i,j);
            }
            x+=2;
        }
    }
}
