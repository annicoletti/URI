/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1156;

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args) {
        double result = 0.0;
        for(int i=1, j=1;j<=39;i*=2,j+=2){
            result += (j/(double)i);
            //System.out.println(j+"/"+i+"="+result);
        }
        System.out.printf("%.2f\n",result);
    } 
}