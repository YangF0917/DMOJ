package Finished;
import java.util.*;

public class WhoHasSeenTheWind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = 0;
		
		for (int i = 1; i <= m; i++) {
			double a = (h*i*i*i+2*i*i+i);
			double b = 6 * i*i*i*i;
			if (a <= b) {
				if (t == 0) {
					t = i;
				}
			}
		}
		if(t != 0) {
			System.out.println("The balloon first touches ground at hour:\n" + t);
		}
		else {
			System.out.println("The balloon does not touch ground in the given time.");
		}
	}

}
