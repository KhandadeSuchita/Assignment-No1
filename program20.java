/* Write a program in JAVA to convert temperature in Fahrenheit to Celsius.*/  
 
import java.util.Scanner; 
public class Code21
{
   public static void main(String[] args) 
 {
   int cel, far;
   Scanner sc= new Scanner(System.in);
   
   System.out.println("Convert temperature in Fahrenhait to Celsius : ");
   
   System.out.println("..............................................");
   
   System.out.print("Input the temperature in Fahrenheit : ");
   int a= sc.nextInt();
   System.out.println("The temperature in Fahrenheit : "+a);
   far = a;
   cel =((far-32)*5)/9;  
   System.out.println("The temperature in Celsius : "+cel);

  }
}