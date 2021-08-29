/*Write a program in JAVA to display the operation of pre and post increment and decrement.  */ 

import java.util.Scanner;
public class Code19{
    
    public static void main(String[] args)  {
        int num = 57;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Display the operation of pre and post increment and decrement :");
        
        System.out.println(".............................,.................");
   
        System.out.print("The number is : ");
        
        
        num= s.nextInt();
        num= ++num;
   
        System.out.println("After post increment by 1 the number is : "+num);
        num++;
        
        System.out.println("After pre increment by 1 the number is : "+num);
        ++num;
        
        System.out.println("After increasing by 1 the number is : "+num);
        num--;
        
        System.out.println("After post decrement by 1 the number is : "+num);
        --num;
      
        System.out.println("After pre decrement by 1 the number is : "+num);
        num=num-1;
        
        System.out.println("After decreading by 1 the number is : "+num);
    }   
}