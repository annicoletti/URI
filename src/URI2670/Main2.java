package URI2670;

/**
 *
 * @author NICOLETTI A.
 */

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> people = new ArrayList<>();
        people.add(scan.nextInt());
        people.add(scan.nextInt());
        people.add(scan.nextInt());
        int time = 0;
        
        int indexOfMAx = people.indexOf(Collections.max(people));
        //System.out.println("IOM = " + indexOfMAx);
        if(people.get(0).equals(people.get(2)) || people.get(0).equals(people.get(1).equals(people.get(2)))){
         indexOfMAx = 1;   
        }
        
        for (int i = 0; i < 3; i++) {
            int distance = Math.abs(indexOfMAx - i);
            //System.out.println(distance);
            switch(distance){
                case 1 : {
                    time += 2 * people.get(i);
                    break;
                }
                case 2 : {
                    time += 4 * people.get(i);
                    break;
                }                
            }
        }
        //System.out.println(people.indexOf(Collections.max(people)));
        //System.out.println(people);
        System.out.println(time);
    }
}
