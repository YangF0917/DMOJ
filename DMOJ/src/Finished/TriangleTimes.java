package Finished;
import java.util.*;

public class TriangleTimes {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c && a+b+c == 180)
        {
            System.out.println("Equilateral");
        }
        else if (a+b+c != 180)
        {
            System.out.println("Error");
        }
        else if (a!=b && b != c && a != c)
        {
            System.out.println("Scalene");
        }
        else
        {
            System.out.println("Isosceles");
        }
    }
}
