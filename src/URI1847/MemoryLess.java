package URI1847;

/**
 *
 * @author NICOLETTI A.
 */
public class MemoryLess {
   
    int a,b,t;
    public MemoryLess(int a, int b, int t){
        this.a = a;
        this.b = b;
        this.t = t;
    }
    
    public static void main(String[] args) {
        int i =0;
        while(i<=0){
            System.out.println("1");
            for (int j = 0; j <= 0; j--) {
                System.out.println("2");
                System.out.println("a");
            }
        }
    }
}
