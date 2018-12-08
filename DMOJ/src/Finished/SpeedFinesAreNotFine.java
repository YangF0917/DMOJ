package Finished;
import java.util.*;

public class SpeedFinesAreNotFine {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int l = sc.nextInt();
        int sp = sc.nextInt();
        if (sp-l > 0)
        {
            if (sp - l >= 31)
            {
                System.out.println("You are speeding and your fine is $500.");
            }
            else if (sp - l <= 20)
            {
                System.out.println("You are speeding and your fine is $100.");
            }
            else
            {
                System.out.println("You are speeding and your fine is $270.");
            }
        }
        else {
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}
