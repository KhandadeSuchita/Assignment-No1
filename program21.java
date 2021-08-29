//Write a program in JAVA to find the third angle of a triangle.  

import java.util.Scanner;
class Code22
{
public static void main(String args[])
{
    int a, b, c;
    Scanner s=new Scanner(System.in);
    
    System.out.println("Find the third angle of a triangle : ");
    
    System.out.println(".................................");
    System.out.print("Input the 1st angle of triangle : ");
    a=s.nextInt();
    
    System.out.print("Input the 2nd angle of triangle : ");
    b=s.nextInt();;

    /* Compute third angle */
    c = 180 - (a + b);

    /* Print value of the third angle */
    System.out.println("The 3rd angle of the triangle is : "+c);
}
}