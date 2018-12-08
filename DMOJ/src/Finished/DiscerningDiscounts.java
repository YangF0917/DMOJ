package Finished;
import java.util.*;
public class DiscerningDiscounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long t = sc.nextLong();
		int counter = 0;
		
		for (int i = 0; i < n; i++) {
			long a = sc.nextInt();
			int b = sc.nextInt();
			if ((double)a * (100.0-b)/100.0 <= t) counter++;
		}
		System.out.println(counter);
	}

}
