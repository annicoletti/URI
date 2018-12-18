/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1012;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double c = scan.nextDouble();
        Double triangulo = (a*c)/2.0;
        Double circulo = (3.14159 * c * c);
        Double trapezio = ((a + b)/2)*c;
        Double quadrado = Math.pow(b, 2);
        Double retangulo = (a*b);        
       
        System.out.printf("TRIANGULO: %.3f\n",triangulo);
        System.out.printf("CIRCULO: %.3f\n",circulo);
        System.out.printf("TRAPEZIO: %.3f\n",trapezio);
        System.out.printf("QUADRADO: %.3f\n",quadrado);
        System.out.printf("RETANGULO: %.3f\n",retangulo);                
    }
}
