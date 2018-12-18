/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1048;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double salary = scan.nextDouble();
        Double add;
        int percent;
        if(salary <= 400.00){
            add = salary * 0.15;
            percent = 15;            
        }
        else if(salary <= 800.00){
            add = salary * 0.12;
            percent = 12;  
        }
        else if(salary <= 1200.00){
            add = salary * 0.1;
            percent = 10;  
        }
        else if(salary <= 2000.00){
            add = salary * 0.07;
            percent = 7;  
        }
        else {
            add = salary * 0.04;
            percent = 4;  
        }
        System.out.printf("Novo salario: %.2f\n", (salary+add));
        System.out.printf("Reajuste ganho: %.2f\n", add);
        System.out.printf("Em percentual: %d %%\n", percent);
    }
}
