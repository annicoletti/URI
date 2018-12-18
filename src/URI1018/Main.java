/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1018;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int total = value;
        int n100 = 0;
        int n50 = 0;
        int n20 = 0;
        int n10 = 0;
        int n5 = 0;
        int n2 = 0;
        int n1 = 0;
        if(value < 0 || value >= 1000000){
            
        }
        else {
            while (value !=0){
                if(value >= 100){
                    value -= 100;
                    n100++;
                }
                else if(value >= 50){
                    value -= 50;
                    n50++;
                }
                else if(value >= 20){
                    value -=20;
                    n20++;
                }
                else if(value >= 10){
                    value -=10;
                    n10++;
                }
                else if(value >= 5){
                    value -=5;
                    n5++;
                }
                else if(value >= 2){
                    value -= 2;
                    n2++;
                }
                else if (value >= 1){
                    value -=1;
                    n1++;
                }
            }
        }
        System.out.println(total);
        System.out.printf("%d nota(s) de R$ 100,00\n", n100);
        System.out.printf("%d nota(s) de R$ 50,00\n", n50);
        System.out.printf("%d nota(s) de R$ 20,00\n", n20);
        System.out.printf("%d nota(s) de R$ 10,00\n", n10);
        System.out.printf("%d nota(s) de R$ 5,00\n", n5);
        System.out.printf("%d nota(s) de R$ 2,00\n", n2);
        System.out.printf("%d nota(s) de R$ 1,00\n", n1);
    }
}
