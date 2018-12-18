/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1038;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int code = scan.nextInt();
        int quantity = scan.nextInt();
        Double total;
        switch (code) {
            case 1:
                total = quantity * 4.00;
                System.out.printf("Total: R$ %.2f\n",total);
                break;
            case 2:
                total = quantity * 4.50;
                System.out.printf("Total: R$ %.2f\n",total);
                break;
            case 3:
                total = quantity * 5.00;
                System.out.printf("Total: R$ %.2f\n",total);
                break;
            case 4:
                total = quantity * 2.00;
                System.out.printf("Total: R$ %.2f\n",total);
                break;
            case 5:
                total = quantity * 1.50;
                System.out.printf("Total: R$ %.2f\n",total);
                break;
        }
    }    
}
