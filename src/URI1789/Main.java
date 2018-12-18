package URI1789;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int level = 0;
            int faster = 0;
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                list.add(scan.nextInt());
            }
            faster = Collections.max(list);
            if (faster>=20){
                level =3;
            }
            else if(faster >=10){
                level =2;
            }
            else{
                level =1;
            }
            System.out.println(level);
//            System.out.println("LEVEL = " +level);
//            System.out.println("FASTER = " +faster);
        }
        scan.close();
    }
}
