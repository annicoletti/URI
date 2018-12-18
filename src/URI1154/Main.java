/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1154;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, age=0, qtd=0;
        while((n=scan.nextInt())>=0){
            age += n;
            qtd++;
        }
        System.out.printf("%.2f\n", ((double)age/qtd));
    }
}
