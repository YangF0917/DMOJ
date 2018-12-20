package Finished;
import java.util.*;
public class ppwindsor18p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
