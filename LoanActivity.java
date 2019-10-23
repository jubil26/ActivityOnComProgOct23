/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activityoncomprog;

/**
 *
 * @author loyd
 */
import java.util.Scanner;
public class LoanActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
       double ipy,ipm,ipm2 = 0, mp,mp2=0,lm, lm2 , count=0 ;
   
       System.out.println("Enter the value of loaned money:");
       lm = myObj.nextInt();
       System.out.println("Enter value of the interest per year:");
       ipy = myObj.nextDouble();
       System.out.println("Enter the value of monthly payment:");
       mp = myObj.nextDouble();
double ri = ipy/100;

while (lm > 0){
ipm = ri/12;
ipm2 = lm*ipm;
mp2 = mp - ipm;


    if (mp < ipm2)
    {
     System.out.println();
         System.out.println("The monthly payment is too low and with this monthly "
              + "payment loan amount could not be repaid.");
          System.exit(0);
    }
      else{
               lm= lm - mp2 ;
               count++;
            
                }
}
                System.out.println();
                System.out.println("Number of months it would take to repay the loan :" + count +" months");
  
              

    }
    
}
