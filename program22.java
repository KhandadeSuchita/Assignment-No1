//Write a program in JAVA that converts kilometers per hour to miles per hour.   

import java.util.Scanner;
 
public class Code22{
    public static void main(String[] args) {
        
        double kiloMeters,miles;
        
        double conversionFactor = 1.609344;
        
        System.out.println("Convert kilometers per hour to miles per hour : ");
        
        System.out.println(".........................................");

        System.out.print("Input the distance  in Kilometer : ");
        
        Scanner input = new Scanner(System.in);
        kiloMeters = input.nextDouble();
        miles = kiloMeters / conversionFactor;

        System.out.println("The " +kiloMeters+ " Km./hr.means " +miles+  " Miles/hr.");
 
    }
}