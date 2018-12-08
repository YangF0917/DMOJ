package Finished;
import java.util.*;

public class MultipleChoice {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int counter = 0;
        int n = sc.nextInt();
        String [] stu = new String [n];
        String [] ans = new String [n];
        for(int i = 0; i < n; i++) {
            stu[i] = sc.next();
        }
        for(int i = 0; i < n; i++) {
            ans[i] = sc.next();
        }
        for(int i = 0; i < n; i++) {
            if (stu[i].equals(ans[i]))
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
