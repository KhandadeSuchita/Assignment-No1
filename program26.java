//Write a program in JAVA to convert temperature in Celsius to Kelvin.   

import java.util.Scanner; 
public class Code26{
    public static void main(String[] args){
        double cel,kel;
        Scanner s= new Scanner(System.in);
   
   System.out.println("Convert temperature in Celsius to Kelvin : ");
   System.out.println("............................................");
   System.out.print("Input the temperature in Celsius : ");
   
   double a= s.nextDouble();
   System.out.println("The temperature in Celsius : "+a);
   
   cel=a;
   kel=cel + 273;
  System.out.println("The temperature in Kelvin : "+kel);
}
}
