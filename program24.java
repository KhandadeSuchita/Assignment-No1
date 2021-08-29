//Write a program in JAVA to convert temperature in Kelvin to Celsius.   

import java.util.Scanner; 
public class Code24
{
   public static void main(String[] args) 
 {
   double kel, cel;
   Scanner sc= new Scanner(System.in);
   
   System.out.println("Convert temperature in Kelvin to Celsius : ");
   
   System.out.println("............................................");
   
   System.out.print("Input the temperature in Kelvin : ");
   
   int a= sc.nextInt();
   
   System.out.println("The temperature in Kelvin : "+a);
   
   kel=a;
   cel=kel - 273.15;
   
   System.out.println("The temperature in Celsius : "+cel);

  }
}