
package URI1005;

import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double average = ((a*3.5) + (b*7.5)) / 11;
        System.out.printf("MEDIA = %.5f\n", average);
    }
}
