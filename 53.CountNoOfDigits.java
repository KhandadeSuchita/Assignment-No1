//Write a JAVA program to compute the sum of the two given integers and count the number of digits of the sum value.   

import java.util.*;
public class CountNoOfDigit
{
    public static void main(String[] args) 
    {		
        System.out.println("Input two integers(a b):");
        Scanner stdIn = new Scanner(System.in);
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            int sum = a + b;
            int count = 0;
            while(sum != 0)
            {
                sum /= 10;
                ++count;
            }
            System.out.println("Digit number of sum of said two integers:");
            System.out.println(count);
    }
}