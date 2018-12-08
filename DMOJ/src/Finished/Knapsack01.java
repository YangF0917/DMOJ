package Finished;
import java.util.*;

public class Knapsack01 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[n];
        int[] space = new int[n];
        for (int i = 0; i < n; i++) {
            space[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        long maxS = 0;
        for (int i = 0; i < n; i++){
            if (value[i] > 0) {
                maxS += space[i];
            }
        }
        System.out.println(maxS);
    }
}
