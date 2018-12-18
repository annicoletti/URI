package URI1960;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int I=1, V=5, X=10, L=50, C=100, D=500, M=1000;
        
        while(number>=900){
            if(number<1000){
                System.out.print("CM");
                number-=C;
            }
            else{
                System.out.print("M");
                number-=M;
            }
        }
        
        while(number>=400){
            if(number<500){
                System.out.print("CD");
                number-=C;
            }
            else if(number<=300){
                System.out.print("C");
                number-=C;
            }
            else if(number>500){
                System.out.print("DC");
                number-=D+C;
            }
            else{
                System.out.print("D");
                number-=D;
            }
        }
        
        System.out.println();
        System.out.println(number);
    }
}
