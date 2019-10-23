/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activityoncomprog;
import java.util.Scanner;
/**
 *
 * @author loyd
 */
public class ActivityOnComProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner myObj=new Scanner(System.in);
   int seconds;
    seconds = myObj.nextInt();
    double earthdays = seconds/86400.0;
    double earthyears = earthdays/365.25;
    System.out.println("Earth; orbital period = " + earthyears + "earthyears");
    System.out.println("Mercury; orbital period = " + earthyears * 0.2408467 );
    System.out.println("Venus; orbital period = " + earthyears * 0.61519726 );
    System.out.println("Mars; orbital period = " + earthyears * 1.8808158 );
    System.out.println("Jupiter; orbital period = " + earthyears * 11.862615 );
    System.out.println("Saturn; orbital period = " + earthyears * 29.447498);
    System.out.println("Uranus; orbital period = " + earthyears * 84.016846 );
    System.out.println("Neptune; orbital period = " + earthyears * 164.79132 );
    
        
    }
    
}
