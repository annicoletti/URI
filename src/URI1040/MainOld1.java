/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1040;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class MainOld1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double n1 = scan.nextDouble();
        Double n2 = scan.nextDouble();
        Double n3 = scan.nextDouble();
        Double n4 = scan.nextDouble();
        Double exam = 0.0;
        
        Double media = ((n1*2)+(n2*3)+(n3*4)+(n4))/10.0;
        
        if(media<5){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }
        else if(media>=7){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        }
        else{
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            
            exam = scan.nextDouble();
            
            System.out.printf("Nota do exame: %.1f\n", exam);
            media = (media + exam) / 2.0;
            if (media < 5){
                System.out.println("Aluno reprovado.");
                System.out.printf("Media: %.1f\n", media);
            }
            else{                
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", media);
            }
        }
    }    
}
