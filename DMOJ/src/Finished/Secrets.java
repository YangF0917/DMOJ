package Finished;
import java.util.*;

public class Secrets{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int x1,x2,y1,y2,xs,ys,d;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        xs = sc.nextInt();
        ys = sc.nextInt();
        d = sc.nextInt();
        if (Math.pow((x1-xs),2.0) + Math.pow((y1-ys),2.0) <= Math.pow(d,2.0) || Math.pow((x2-xs),2.0) + Math.pow((y2-ys),2.0) <= Math.pow(d,2.0))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
