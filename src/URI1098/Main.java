/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1098;

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args) {
        double j1 = 1 ;
        double j2 = 2 ;
        double j3 = 3 ;
        double add=0.2;
        
        for (double i=0.0; i<=2.1; i+=0.2){
//            System.out.println(i);
//            System.out.println((int)i);
            if(i == (int)i || i>=1.9){
                System.out.printf("I=%.0f J=%.0f\n",i,j1);
                System.out.printf("I=%.0f J=%.0f\n",i,j2);
                System.out.printf("I=%.0f J=%.0f\n",i,j3);
            }
            else{
                System.out.printf("I=%.1f J=%.1f\n",i,j1);
                System.out.printf("I=%.1f J=%.1f\n",i,j2);
                System.out.printf("I=%.1f J=%.1f\n",i,j3);
            }
            j1+=add;
            j2+=add;
            j3+=add;
        }
    }
}
