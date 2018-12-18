/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1051;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double salary = scan.nextDouble();
        Double tax=0.0;
        
        if(salary <= 2000){
            System.out.println("Isento");
        }
        else if (salary <= 3000){          
            tax = ((salary-2000)*0.08);
            System.out.printf("R$ %.2f\n", tax);
        }
        else if(salary <= 4500){
            salary -= 2000;
            tax = (1000*0.08) + ((salary-1000)*0.18);
            System.out.printf("R$ %.2f\n", tax);
        }
        else {
            salary -= 2000;
            tax = (1000*0.08) + (1500*0.18)+((salary-2500)*0.28);
            System.out.printf("R$ %.2f\n", tax);
        }     
    }    
}
