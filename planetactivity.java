package activityoncomprog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author loyd
 */
import java.util.Scanner;
public class planetactivity {
    public static void main(String [] args){
    Scanner myObj=new Scanner(System.in);
   int seconds;
   System.out.println("How old are you in a seconds: ");
    seconds = myObj.nextInt();
    
    double earthdays = seconds/86400.0;
    double earthyears = earthdays/365.25;
    System.out.println("Earth; orbital period = " + earthyears + " earthyears");
    System.out.println("Mercury; orbital period = " + earthyears * 0.2408467 + " earthyears" );
    System.out.println("Venus; orbital period = " + earthyears * 0.61519726 + " earthyears");
    System.out.println("Mars; orbital period = " + earthyears * 1.8808158 + " eathyears" );
    System.out.println("Jupiter; orbital period = " + earthyears * 11.862615 + " earthyears");
    System.out.println("Saturn; orbital period = " + earthyears * 29.447498 + " earthyears");
    System.out.println("Uranus; orbital period = " + earthyears * 84.016846 + " earthyears" );
    System.out.println("Neptune; orbital period = " + earthyears * 164.79132 + " earthyears");
    
        
    }
}
