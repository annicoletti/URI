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
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int populationA=0, populationB=0;
        double percentGrowingA =0, percentGrowingB=0; 
        int numberOfCases = scan.nextInt();
        for(int i=0; i<numberOfCases; i++){
            populationA = scan.nextInt();
            populationB = scan.nextInt();
            percentGrowingA = scan.nextDouble();
            percentGrowingB = scan.nextDouble();
            
            int years = 0;
            boolean wait = true;
            
            while(populationA <= populationB && wait==true){
                populationA = (int)((double)populationA * ((percentGrowingA/100)+1));
                populationB = (int)((double)populationB * ((percentGrowingB/100)+1));
                
                //populationA = populationA + (int)(populationA * (percentGrowingA/100));
                //populationB = populationB + (int)(populationB * (percentGrowingB/100));
                              
                years++;
                
                if(years>100){
                    wait = false;
                }
                
                //System.out.println("A>"+populationA +"\nB>"+populationB+"\nYEAR>"+years);
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
