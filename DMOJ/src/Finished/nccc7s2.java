package Finished;
import java.util.*;

public class nccc7s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		double c = sc.nextInt();
		double d = sc.nextInt();
		
		double e = sc.nextInt();
		double f = sc.nextInt();
		if (a > c && a < e) {
			//Check y
			if (b < d) {
				System.out.printf("%.3f\n", d-b);
			}
			else {
				System.out.printf("%.3f\n", b-f);
			}
		}
		else if (b > d && b < f) {
			if (a < c) {
				System.out.printf("%.3f\n", c-a);
			}
			else {
				System.out.printf("%.3f\n", a-e);
			}
		}
		else {
			double [] vals = new double [4];
			vals[0] = Math.sqrt((a-c)*(a-c) + (b-d) * (b-d));
			vals[1] = Math.sqrt((a-c)*(a-c) + (b-f) * (b-f));
			vals[2] = Math.sqrt((a-e)*(a-e) + (b-d) * (b-d));
			vals[3] = Math.sqrt((a-e)*(a-e) + (b-f) * (b-f));
			Arrays.sort(vals);
			System.out.printf("%.3f\n", vals[0]);
		}
	}

}
