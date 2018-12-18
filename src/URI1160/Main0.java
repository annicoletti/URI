/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1160;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int populationA, populationB;
        double percentGrowingA, percentGrowingB; 
        int numberOfCases = scan.nextInt();
        for(int i=0; i<numberOfCases; i++){
            populationA = scan.nextInt();
            populationB = scan.nextInt();
            percentGrowingA = scan.nextDouble();
            percentGrowingB = scan.nextDouble();
            
            double realPercentGroing = percentGrowingA - percentGrowingB;
            int years = 0;
            boolean wait = true;
            
            while(populationA <= populationB && true){
                populationA = populationA + (int)(populationA * (realPercentGroing/100));
                years++;
                if(years>100){
                    wait = false;
                }
            }
            
            if(years <= 100){
                System.out.println(years + " anos.");
            }
            else{
                System.out.println("Mais de 1 seculo.");
            }
        }
    }
}
