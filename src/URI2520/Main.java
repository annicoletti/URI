package URI2520;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()){
            int l = scan.nextInt();
            int c = scan.nextInt();

            int poke[] = new int[2];
            int coach[] = new int[2];
            int tempo = 0;

            int city[][] = new int[l][c];
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    int t = scan.nextInt();
                    if(t==0){
                        city[i][j]=t;
                    }
                    else if(t==1){
                        city[i][j]=t;
                        coach[0] = i;
                        coach[1] = j;  
                    }
                    else if(t==2){
                        city[i][j]=t;
                        poke[0] = i;
                        poke[1] = j;
                    }
                }
            }
            
            System.out.println(tempo = Math.abs(coach[0] - poke[0]) + Math.abs(coach[1] - poke[1]));

//            //Verifica Dados
//            System.out.printf("POKE [%d],[%d]\n",poke[0],poke[1]);
//            System.out.printf("TREI [%d],[%d]\n",coach[0],coach[1]);
//            for (int i = 0; i < l; i++) {
//                for (int j = 0; j < c; j++) {
//                    System.out.print(city[i][j]);
//                }
//                System.out.println();
//            }
        }
    }
}
