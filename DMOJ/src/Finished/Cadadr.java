package Finished;
import java.io.*;
import java.util.*;

public class Cadadr{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String use = sc.nextLine();
        for (int i = 2; i < use.length()-4; i++){
            if (use.charAt(i) == 'a')
            {
                System.out.print("(car ");
            }
            else if (use.charAt(i) == 'd')
            {
                System.out.print("(cdr ");
            }
        }
        System.out.print(" x");
        for (int i = 2; i < use.length()-4; i++) {
            System.out.print(")");
        }
    }
}
