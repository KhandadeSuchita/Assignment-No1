//Write a program in JAVA to convert temperature in Fahrenheit to Kelvin.   

import java.util.Scanner; 
public class Code25
{
   public static void main(String[] args) 
 {
     double kel, far;
   Scanner sc= new Scanner(System.in);
   
   System.out.println("Convert temperature in Fahrenheit to Kelvin : ");
   
   System.out.println("............................................");
   
   System.out.print("Input the temperature in Fahrenheit : ");
   
   double a= sc.nextDouble();
   
   System.out.println("The temperature in Fahrenheit : "+a);
   
   far=a;
   kel=273.5 + ((far- 32.0) *(5.0/9.0));
   
   System.out.println("The temperature in Kelvin : "+kel);

  }
}