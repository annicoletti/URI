/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1478;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input,n,diagonal;
        int matriz[][];
        
        while ((input=scan.nextInt())!=0){
                       
            matriz = new int[input][input];
            n = input;
            
            diagonal = n/2;
            int p=0;
            
            for(int i=p; i<n; i++){
                for(int j=p; j<n; j++){
                    if(i==j){
                        matriz[i][j]=1;
                    }
                    else if(j>i){
                       matriz[i][j] = (j-i)+1; 
                    }
                    else {                        
                       matriz[i][j] = (i-j)+1; 
                    }
                }
            }
            diagonal--;
            p++;
            n--;
            
            
            
            /*IMPRIME MATRIZ*/
            for(int i=0; i<input; i++){
                for(int j=0; j<input; j++){
                    if(j==0){
                        System.out.printf("%3d", matriz[i][j]);
                    }
                    else{
                        System.out.printf(" %3d", matriz[i][j]);
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");                
        }
    }
}
