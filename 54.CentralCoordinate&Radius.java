 //67. Write a JAVA program to which prints the central coordinate and the radius of a circumscribed circle of a triangle which is created by three points on the plane surface.   
 
 import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 
class CentralCoordinate&Radius{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input x1, y1, x2, y2, x3, y3 separated by a single space:"); 

			String[] input = br.readLine().split(" ");
 
            double x1 = Double.parseDouble(input[0]);
            double y1 = Double.parseDouble(input[1]);
            double x2 = Double.parseDouble(input[2]);
            double y2 = Double.parseDouble(input[3]);
            double x3 = Double.parseDouble(input[4]);
            double y3 = Double.parseDouble(input[5]);
 
            double A = x2 - x1;
            double B = y2 - y1;
            double p = (y2 * y2 - y1 * y1 + x2 * x2 - x1 * x1) / 2;
            double C = x3 - x1;
            double D = y3 - y1;
            double q = (y3 * y3 - y1 * y1 + x3 * x3 - x1 * x1) / 2;
 
            double X = (D * p - B * q) / (A * D - B * C);
            double Y = (A * q - C * p) / (A * D - B * C);
 
            double r = Math.sqrt(Math.pow(X - x1, 2.0) + Math.pow(Y - y1, 2.0));
            System.out.println("\nRadius and the central coordinate:"); 
            System.out.printf("%.3f (%.3f %.3f)", r, X, Y);        
    }
}