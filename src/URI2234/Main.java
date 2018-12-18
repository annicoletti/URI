package URI2234;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    
    private int guest, hotdog;
    private double average;
    
    public Main(int guest, int hotdog){
        setGuess(guest);
        setHotdog(hotdog);
    }
    
    public void setGuess(int guest){
        this.guest = guest;
    }
    
    public void setHotdog(int hotdog){
        this.hotdog = hotdog;
    }
    
    public int getGuest(){
        return guest;
    }
    
    public int getHotdog(){
        return hotdog;
    }
    
    public double getAverage(){
        return average;
    }
    
    public void makeAverage(){
        this.average = (getGuest() /(double) getHotdog());
        System.out.printf("%.2f\n",getAverage());
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main m = new Main(scan.nextInt(), scan.nextInt());
        m.makeAverage();
    }
}
