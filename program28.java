// Write a program in JAVA to compute the total and average of four numbers.   

public class Code28{
	public static void main(String[] args) {
		
    	float n1,n2,n3,n4,tot,avrg;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Compute the total and average of four numbers : ");
    System.out.println("----------------------------------------------------");
    
     System.out.println("Input 1st two numbers (separated by space) : " + n1 +n2);
      System.out.println("Input last two numbers (separated by space) : " + n3 +  n4);
    	tot=n1+n2+n3+n4;
		avrg=tot/4;
       System.out.println("The total of four numbers is : "+ tot);
        System.out.println("The average of four numbers is : "+ avrg);
    }
}