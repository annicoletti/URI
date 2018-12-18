package URI1960;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    
    static Scanner scan = new Scanner(System.in);
    private int latin, integerTemp;
    private String grego="", stringTemp;
    
    public void fazGrego(int n){
        while (n>0){            
            stringTemp = Integer.toString(n);
            if(n>=1000){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=1000;
                grego+="M";
            }
            else if(n>=900){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=900;
                grego+="CM";
            }
            else if(n>=500){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=500;
                grego+="D";
            }
            else if(n>=400){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=400;
                grego+="CD";
            }
            else if(n>=100){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=100;
                grego+="C";
            }
            else if(n>=90){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=90;
                grego+="XC";
            }
            else if(n>=50){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=50;
                grego+="L";
            }
            else if(n>=40){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=40;
                grego+="XL";
            }
            else if(n>=10){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=10;
                grego+="X";
            }
            else if(n==9){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=9;
                grego+="IX";
            }
            else if(n>=5){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=5;
                grego+="V";
            }
            else if(n==4){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=4;
                grego+="IV";
            }
            else if(n>=1){
                integerTemp = Character.getNumericValue(stringTemp.charAt(0));
                //System.out.println("IT= "+integerTemp);
                n-=1;
                grego+="I";
            }
            //System.out.println("ST= " + stringTemp.length() + "\nS[0]= " + stringTemp.charAt(0) + "\nIT= " + n + "\nGREGO= " + grego);
        }
    }
    
    public void go(){
        latin = scan.nextInt();
        fazGrego(latin);
        System.out.println(grego);
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        m.go();
    }
}
