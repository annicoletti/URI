/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1155;

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args) {
        double result = 0.0;
        for(int i=1;i<=100;i++){
            result += (1/(double)i);
        }
        System.out.printf("%.2f\n",result);
    } 
}
