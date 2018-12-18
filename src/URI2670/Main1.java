package URI2670;

/**
 *
 * @author NICOLETTI A.
 */

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> people = new ArrayList<>();
        people.add(scan.nextInt());
        people.add(scan.nextInt());
        people.add(scan.nextInt());
        int time = 0;
        for (int i = 0; i < 3; i++) {
            if(i != people.indexOf(Collections.max(people))){
                if(i!=1){
                    time += people.get(i)*4;
                }
                else{
                    time += people.get(i)*2;
                }
            }
        }
        System.out.println(people.indexOf(Collections.max(people)));
        System.out.println(people);
        System.out.println(time);
    }
}
