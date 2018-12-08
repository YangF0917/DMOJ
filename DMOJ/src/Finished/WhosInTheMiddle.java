package Finished;

import java.util.*;

public class WhosInTheMiddle{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b <= c && b <= a) {
            if (c <= a) {
                a = c;
            }
        }
        else if (c <= a && c <= b){
            if (b <= a)
            {
                a = b;
            }
        }
        else
        {
            if (c <= b)
            {
                a = c;
            }
            else
            {
                a = b;
            }
        }
        System.out.println(a);
    }
}
