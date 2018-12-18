package URI2163;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main1 {
    
    static int wisL=1, wisC=1;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        int j = scan.nextInt();
        boolean on = true;
        boolean find = false;
        int r[] = new int[2];
        
        int field[][] = new int[i][j];
        
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                field[k][l] = scan.nextInt();
            }
        }
        
        //Processando
        while(on){            
            r=search42plus(field, i, j);
            System.out.println(wisL + " " + wisC);
            
            if(r[0]!= 0 && r[1]!=0){
                System.out.println("set 7");
                int valid = 7;
                for (int k = r[0]-1; k <= r[0]+1; k++) {
                    for (int l = r[1]-1; l <= r[1]+1; l++) {
                        //System.out.print("searching... ");
                        if(field[k][l]==7){
                            System.out.print(field[k][l] + " " + k + " " + l + " : valid " + valid + "\n");
                            valid--;
                        }
                        if(valid<0){
                            //System.out.println(r[0] + " " + r[1]);
                            find = true;
                            on=false;
                        }
                        //System.out.println();
                    }
                }
            }
            else{
                on = false;
            }
            
            if(find){
                System.out.println(r[0] + " " + r[1]);
            }
            else{
                System.out.println(r[0] + " " + r[1]);
            }   
        }
    }
    
    public static int[] search42(int grade[][], int line, int column){
        int result[] = new int[2];
        int l=0,c=0;
        for (int i = 1; i < line-1; i++) {
            for (int j = 1; j < column-1; j++) {
               if(grade[i][j]==42){
                   l=i;
                   c=j;
               }
            }            
        }
        result[0] = l;
        result[1] = c;
        System.out.println(result[0] + " " +result[1]);
        return result;
    }
    
    public static int[] search42plus(int grade[][], int line, int column){
        int result[] = new int[2];
        int l=0,c=0;
        
        int i=wisL, j=wisC;
        
        for ( i = 1; i < line-1; i++) {
            for ( j = 1; j < column-1; j++) {
               if(grade[i][j]==42){
                   l=i;
                   c=j;
               }
            }            
        }
        result[0] = l;
        result[1] = c;
        wisL = l;
        wisC = c;
        System.out.println(result[0] + " " +result[1]);
        return result;
    }
}
