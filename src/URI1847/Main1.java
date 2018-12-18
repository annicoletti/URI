package URI1847;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Main1 m = new Main1();
        Scanner scan = new Scanner(System.in);
        int day1 = scan.nextInt();
        int day2 = scan.nextInt();
        int day3 = scan.nextInt();
        
        String sad=":(",happy=":)";
        
        int forecast1 = m.upOrDown(day1,day2);
        int forecast2 = m.upOrDown(day2,day3);
        int diff1 = m.diffTemp(day1, day2);
        int diff2 = m.diffTemp(day2, day3);
        
        if (forecast1 < 0 && forecast2 > 0){
            System.out.print(happy);
        }
        if (forecast1 >0 && forecast2 <=0){
            System.out.print(sad);
        }
        if (forecast1 > 0 && forecast2 >0 && diff1 > diff2){
            System.out.print(sad);
        }
        if (forecast1 > 0 && forecast2 >0 && diff1 <= diff2){
            System.out.print(happy);
        }
        if (forecast1 < 0 && forecast2 <0 && diff1 > diff2){
            System.out.print(happy);
        }
        if (forecast1 < 0 && forecast2 <0 && diff1 <= diff2){
            System.out.print(sad);
        }
        if (forecast1 == 0 && forecast2 > 0 ){
            System.out.print(happy);
        }
        if (forecast1 == 0 && forecast2 < 0 ){
            System.out.print(sad);
        }
        else{
            System.out.print(sad);
        }
        
//        System.out.println("day 1 and 2: " + m.diffTemp(day1, day2)+ "\nDay 2 and 3: " + m.diffTemp(day2, day3));
//        System.out.println(forecast1 + " " + forecast2);
    }
    
    public int upOrDown(int dayBefore, int dayAfter){
        if(dayBefore > dayAfter){
            return -1;
        }
        else if (dayBefore == dayAfter){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public int diffTemp(int db, int da){
        int fc = upOrDown(db, da);
        if(fc>0){
            return da - db;
        }
        else if(fc<0){
            return db - da;
        }
        else{
            return 0;   
        }
    }
}
