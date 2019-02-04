package Finished;
import java.util.*;
public class pwindsor18p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double max = Integer.MIN_VALUE;
		int x = 0; int y = 0;
		for (int i= 0; i < n; i++) {
			int x1 = sc.nextInt(); int y1 = sc.nextInt();
			if (Math.pow(x1, 2) + Math.pow(y1, 2) > max) {
				max = Math.pow(x1, 2) + Math.pow(y1, 2);
				x = x1; y = y1;
			}
		}
		System.out.println(x + " " + y);
	}

}
