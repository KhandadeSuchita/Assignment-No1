//Write a program in JAVA to check whether a number is positive, negative or zero.   

public class Code19
{
    public static void main(String[] args) 
    {
        int number=256;
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}