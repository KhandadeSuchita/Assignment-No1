/*Java Program to Add, subtract, multiply and divide Two Numbers
*/

import java.util.Scanner;
public class Airthmatic {

   public static void main(String[] args) {
      
      Scanner  ed=new  Scanner(System.in);
      
       int x,y;
       int sum,mul,dvd,sub;
       
       System.out.println("Enter Two Numbers = ");
       
       x=ed.nextInt();
       y=ed.nextInt();
       
       sum=x+y;       
       sub=x-y;
       mul=x*y;
       dvd=x/y;

       System.out.println("Results");
       System.out.println("Addition = "+sum);       
       System.out.println("Subtraction = "+sub);   
       System.out.println("Multiplication = "+mul);
       System.out.println("Division = "+dvd);
    }

}