package Finished;
import java.util.*;
public class APlusB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        long[] sum = new long[num];
        long a, b;
        for (int i = 0; i < num; i++) {
            a = sc.nextLong();
            b = sc.nextLong();
            sum[i] = a + b;
        }
        for (int i = 0; i < num; i++) {
            System.out.println(sum[i]);
        }
	}
}
