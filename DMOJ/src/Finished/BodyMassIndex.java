package Finished;
import java.util.*;

public class BodyMassIndex{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        if (weight / height/height > 25)
        {
            System.out.println("Overweight");
        }
        else if (weight / height/height < 18.5)
        {
            System.out.println("Underweight");
        }
        else{
            System.out.println("Normal weight");
        }
    }
}
