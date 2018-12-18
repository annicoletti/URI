/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1181;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double resultado = 0;
        int linha = scan.nextInt();
        String operacao = scan.next();
        //int inc=0;
        
        double matriz[][] = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j]=scan.nextDouble();
        //        inc++;
            }            
        }
        
        for(int i=linha, j=0; j<12;j++){
            resultado += matriz[i][j];
        }
        
        if(operacao.equals("S")){
            System.out.printf("%.1f\n",resultado);
        }
        else{
            resultado = resultado /12;
            System.out.printf("%.1f\n",resultado);
        }
        
        
//        //imprime matriz
//        System.out.println("//COPIA//");
//        for (int i = 0; i < 11; i++) {
//            for (int j = 0; j < 11; j++) {
//                System.out.print("["+matriz[i][j]+"]");
//            }
//            System.out.println("");
//        }
//      System.out.println("CONFERE= "+inc);
        
    }
}
