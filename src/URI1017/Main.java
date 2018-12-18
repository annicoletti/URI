/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1017;

/**
 *
 * @author Administrador
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int timeTravel = scan.nextInt();
        int averageSpeed = scan.nextInt();
        
        Double consumption = (timeTravel * averageSpeed)/12.0;
        System.out.printf("%.3f\n", consumption);
    }
}
