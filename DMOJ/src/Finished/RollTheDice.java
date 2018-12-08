package Finished;
import java.util.Scanner;
public class RollTheDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int ways = 0;
		
		if (m > 9) {
			m = 9;
		}
		if (n > 9) {
			n = 9;
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j == 10) {
					ways++;
				}
			}
		}
		if (ways == 1) {
			System.out.println("There is 1 way to get the sum 10.");
		}
		else {
			System.out.println("There are " + ways + " ways to get the sum 10.");
		}
	}

}
