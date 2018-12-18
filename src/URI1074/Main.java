/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1074;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        String message = "";
        
        for (int i=0; i<n; i++){
            
            int number = scan.nextInt();            
            if (number == 0){
                message += "NULL";
            }
            else if(number%2 == 0){
                message += "EVEN ";
            }
            else{
                message += "ODD ";
            }
            
            if(number>0){
                message += "POSITIVE";
            }
            else if(number<0){
                message += "NEGATIVE";
            }
            if(i<n-1){
                message += "\n";
            }
        }
        System.out.println(message);
    }    
}
