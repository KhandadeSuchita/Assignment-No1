/*16.Java Program to Find ASCII Value of a Character*/

public class AsciiValue
{
public static void main(String[] args) 
{
char ch = 'a';
int ascii = ch;
int castAscii = (int) ch;
System.out.println("The ASCII value of " + ch + " is: " + ascii);
System.out.println("The ASCII value of " + ch + " is: " + castAscii);
}
}