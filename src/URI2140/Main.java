package URI2140;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numberOfSheets = 0;        
        int valueOf = -1;
        int valuePaied = -1;
        
        while(true){            
            
            numberOfSheets = 0;
            valueOf = scan.nextInt();
            valuePaied = scan.nextInt();
            valuePaied -= valueOf;
            
            if(valueOf+valuePaied==0){break;}
            
            
            while( valuePaied>=2){
                
                //System.out.println("coding.." + valuePaied + " vos " + numberOfSheets);
                if(valuePaied>=100){
                    valuePaied-=100;
                    numberOfSheets++;
                }
                else if(valuePaied>=50){
                    valuePaied-=50;
                    numberOfSheets++;
                }
                else if(valuePaied>=20){
                    valuePaied-=20;
                    numberOfSheets++;
                }
                else if(valuePaied>=10){
                    valuePaied-=10;
                    numberOfSheets++;
                }
                else if(valuePaied>=5){
                    valuePaied-=5;
                    numberOfSheets++;
                }
                else if(valuePaied>=2){
                    valuePaied-=2;
                    numberOfSheets++;
                }
//                else{
//                    System.out.println("else....");
//                    numberOfSheets++;
//                }
            }
            if(numberOfSheets==2){
                System.out.println("possible");
            }
            else{
                System.out.println("impossible");
            }
//            System.out.println(numberOfSheets);
//            System.out.println(valuePaied);
        }
    }
}
