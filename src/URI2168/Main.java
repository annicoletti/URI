package URI2168;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    
    static Scanner scan = new Scanner(System.in);
    static int corner[][];
    static int city[][];
    static int t, n, blocks;
    
    public static void hasNext(int c[]){
        if(c[0] >= city.length){
        
        }
    }
    
    public static void cacthBlock(int c[][], int n[]){
        int cam = 0;
        for (int i = n[0]; i <= (n[0]+1); i++) {
            for (int j = n[1]; j <= (n[1]+1); j++) {
                //System.out.println(c[i][j]);
                if(c[i][j] == 1){
                    cam ++;
                }
            }
        }
        if(cam>=2){
            System.out.printf("S ");
        }
    }
    
    public static void checkBlock(int[][] b){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(b[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {        
        t = scan.nextInt();
        n = t+1;
        blocks = (int)Math.pow(t, 2);
                
        city = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                city[i][j] = scan.nextInt();
            }
        }
        
        //Show Results
        System.out.println("City");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(city[i][j] + " ");
            }
            System.out.println();
        }        
        System.out.println("Blocks: " + blocks);
        System.out.println("City Lenght = " + city.length);
        
        int test[] = new int[2];
        test[0] = 0;
        test[1] = 0;
        cacthBlock(city, test);
        
    }
}
