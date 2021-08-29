//Write a program in JAVA to compute quotient and remainder.   

import java.util.Scanner;
public class Code27{
    public static void main(String[] args){
        
        int dividend, divisor, quo, rem;
        Scanner in = new Scanner(System.in);
        System.out.println("Compute quotient and remainder : ");
        System.out.println("................................");
        //get the dividend value
        System.out.print("Input the dividend :");
        dividend = in.nextInt();
        
        //get the divisor value 
        System.out.print("Input the divisor : ");
        divisor = in.nextInt();
        
        //find quotient 
        quo = dividend / divisor;
        
        //find reminder
        rem = dividend % divisor;
        
        //print the result
        System.out.println("The quotient of the division is : "+quo);
        
        System.out.println("The remainder of the division is : "+rem);
    }
}