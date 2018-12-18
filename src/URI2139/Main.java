
package URI2139;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()){
            
            int userMonth = scan.nextInt();
            int userDay = scan.nextInt();
            
            
            if(userDay>25 && userMonth==12){
                System.out.print("Ja passou!\n");
            }
            else if(userDay==25 && userMonth==12){
                System.out.print("E natal!\n");
            }
            else if(userDay==24 && userMonth==12){
                System.out.print("E vespera de natal!\n");
            }
            else{
//                int day=0;
//                int month=0;
                int cont =0;
                while(userDay!=25 && userMonth<13){
                    if(userMonth==1){
                        for (int i = userDay; i <= 31; i++) {
                            cont ++;
                        }
                        userMonth++;
                        userDay=1;
                    }
                    else if(userMonth==2){
                        for (int i = userDay; i <= 29; i++) {
                            cont ++;
                        }
                        userMonth++;
                        userDay=1;
                    }
                    else if(userMonth==3){
                        for (int i = userDay; i <= 31; i++) {
                            cont ++;
                        }
                        userMonth++;
                        userDay=1;
                    }
                    else if(userMonth==4){
                        for (int i = userDay; i <= 30; i++) {
                            cont ++;
                        }
                        userMonth++;
                        userDay=1;
                    }
                    else if(userMonth==5){
                        for (int i = userDay; i <= 31; i++) {
                            cont ++;
                        }
                        userMonth++;
                        userDay=1;
                    }
                    else if(userMonth==6){
                        for (int i = userDay; i <= 30; i++) {
                            cont ++;
                        }
                        userMonth++;
                        userDay=1;
                    }
                    else if(userMonth==7){
                        for (int i = userDay; i <= 31; i++) {
                            cont ++;
                        }
                        userMonth++;
                        userDay=1;
                    }
                    else if(userMonth==8){
                        for (int i = userDay; i <= 31; i++) {
                            cont ++;
                        }
                        userMonth++;
                        userDay=1;
                    }
                    else if(userMonth==9){
                        for (int i = userDay; i <= 30; i++) {
                            cont ++;
                        }
                        userMonth++;
                        userDay=1;
                    }
                    else if(userMonth==10){
                        for (int i = userDay; i <= 31; i++) {
                            cont ++;
                        }
                        userMonth++;
                        userDay=1;
                    }
                    else if(userMonth==11){
                        //System.out.println(userMonth + " " + userDay + " cont = " + cont );
                        for (int i = userDay; i <= 30; i++) {
                            //System.out.println(cont);
                            cont ++;
                        }
                        userMonth++;
                        userDay=1;
                    }
                    else if(userMonth==12){
                        for (int i = userDay; i <= 24; i++) {
                            cont ++;
                            //System.out.println(cont);
                        }
                        userMonth++;
                        userDay=1;
                    }
                }
                System.out.print("Faltam "+ cont +" dias para o natal!\n");
            }
        }
    }
}
