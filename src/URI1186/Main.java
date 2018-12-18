/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1186;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double resultado = 0;
        String operacao = scan.next();
        int inc=0;
        
        double matriz[][] = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j]=scan.nextDouble();
            }            
        }
        
        for(int i=0; i<12; i++){
            for(int j=0; j<12; j++){
                if((i+j)>11){
                    //System.out.printf("MATRIZ [%d][%d] = %.1f\n", i,j,matriz[i][j]);
                    resultado += matriz[i][j];
                    inc ++;
                }                
            }
            //System.out.println(inc);
        }
        
        if(operacao.equals("S")){
            System.out.printf("%.1f\n",resultado);
        }
        else{
            resultado = resultado /inc;
            System.out.printf("%.1f\n",resultado);
        }

      //System.out.println("CONFERE= "+inc); 
    }
}
