package URI2163;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    
    static Scanner scan = new Scanner(System.in);
    static int startSerachLine=0, startSerachCollumn=0, i,j,endI,endJ,checkpointI=0, checkpointJ=0;
    static int field[][], r[];
    static boolean findIt = false;
    
    public static void main(String[] args) {
        
        //Leitura da quantidade de Linha e Coluna
        i = scan.nextInt();
        j = scan.nextInt();
        
        r = new int[2];
        
        //Final de leitura de i e j
        endI = i-2;
        endJ = j-2;
        
        //Criação do campo e inserção dos dados
        field = new int[i][j];        
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                field[k][l] = scan.nextInt();
            }
        }
        
        //Processamento
        while(findIt==false){
           search42(); 
        }
    }
    
    public static void search42(){ 
        int ale = 0;
        for (int l = checkpointI+1; l < i-1; l++) {
            for (int c = checkpointJ+1; c < j-1; c++) {  
                if(field[l][c]==42){
                    r[0] = l;
                    r[1] = c;
                    //System.out.printf("[%d][%d]\n",l,c);
                    isItThePower();
                    
                    if(findIt==true){
                       System.out.printf("%d %d\n",l+1,c+1);
                       System.exit(0);
                    }                   
                }                           
            }
        }
        if(findIt==false){
            System.out.println("0 0");
            System.exit(0);
        }
    }
    
    public static void isItThePower(){
        int count = 0;
        //System.out.println(r[0] + " " + r[1]);
        for (int k = r[0]-1; k <= r[0]+1; k++) {
            for (int l = r[1]-1; l <= r[1]+1; l++) {
                if(field[k][l]==7){
                    //System.out.print(field[k][l] + " " + k + " " + l + "\n");
                    count++;
                    if(count==8){
                        findIt=true;
                    }
                }
            }
        }
    }
    
    public static int[] search42Old(int grade[][], int line, int column){
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
}
