/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1095;

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args) {
        int i = 1;
        int j = 60;
        do{
            System.out.printf("I=%d J=%d\n",i,j);
            i+=3;
            j-=5;
        }
        while(j>-1);
    }
}
