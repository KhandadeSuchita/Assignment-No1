//Write a program in JAVA to convert temperature in Kelvin to Fahrenheit.   

import java.util.Scanner; 
public class Code23
{
   public static void main(String[] args) 
 {
   double kel, far;
   Scanner sc= new Scanner(System.in);
   
   System.out.println("Convert temperature in Kelvin to Fahrenheit : ");
   
   System.out.println("............................................");
   
   System.out.print("Input the temperature in Kelvin : ");
   
   int a= sc.nextInt();
   
   System.out.println("The temperature in Kelvin : "+a);
   
   kel=a;
   far=(9.0 / 5) * (kel - 273.15) + 32;
   
   System.out.println("The temperature in Fahrenheit : "+far);

  }
}