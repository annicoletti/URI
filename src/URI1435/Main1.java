/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1435;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v,n;
        int matriz[][],matriz1[][],matriz2[][],matriz3[][],matriz4[][];
        boolean par = true;
        while ((v=scan.nextInt())!=0){
            if(v%2!=0){
               par = false;
            }
           
            matriz = new int[v][v];
            
            n =v/2;
            matriz1 = new int[v][v];
            matriz2 = new int[v][v];
            matriz3 = new int[v][v];
            matriz4 = new int[v][v];
            int diagonal;
            
            diagonal=1;
            //Matriz quadrante 1
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i==j){
                        matriz1[i][j]=diagonal;
                        diagonal++;
                    }
                    else{                        
                        matriz1[i][j]=1;
                    }
                }
            }
            
            diagonal=1;
            //Matriz quadrante 2
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if((i+j)==n-1){
                        matriz2[i][j]=diagonal;
                        diagonal++;
                    }
                    else{       
                        matriz2[i][j]=1;
                    }
                }
            }
            
            diagonal=1;
            //Matriz quadrante 3
            for (int i = n; i >= 0; i--) {
                for (int j = n; j >= 0; j--) {
                    if((i+j)==n-1){
                        matriz3[i][j]=diagonal;
                        diagonal++;
                    }
                    else{                        
                        matriz3[i][j]=1;
                    }
                }
            }
            
            diagonal=0;
            //Matriz quadrante 4
            for (int i = n; i >= 0; i--) {
                for (int j = n; j >= 0; j--) {
                    if(i==j){
                        matriz4[i][j]=diagonal;
                        diagonal++;
                    }
                    else{                        
                        matriz4[i][j]=1;
                    }
                }
            }
            
            System.out.println("-------------1-------------");
            
            //Exibe umatriz 1
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%d ",matriz1[i][j]);
                }
                System.out.println("");
            }
            
            System.out.println("-------------2-------------");
            
            //Exibe umatriz 2
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%d ",matriz2[i][j]);
                }
                System.out.println("");
            }
            
            System.out.println("-------------3-------------");
            
            //Exibe umatriz 2
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%d ",matriz3[i][j]);
                }
                System.out.println("");
            }
            
             System.out.println("-------------4-------------");
            
            //Exibe umatriz 2
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%3d ",matriz4[i][j]);
                }
                System.out.println("");
            }
            
            
            
        }
    }
}
