/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1066;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        int positive = 0;
        int negative = 0;
        
        for(int i=0; i<5; i++){
            Double n = scan.nextDouble();
            if((n%2)/2==0){
                odd++;
            }
            else{
                even++;
            }
            if(n>0){
                positive++;
            }
            else if (n<0){
                negative++;
            }
        }        
        System.out.println(odd +      " valor(es) par(es)");        
        System.out.println(even +     " valor(es) impar(es)");        
        System.out.println(positive + " valor(es) positivo(s)");        
        System.out.println(negative + " valor(es) negativo(s)");
    }    
}
