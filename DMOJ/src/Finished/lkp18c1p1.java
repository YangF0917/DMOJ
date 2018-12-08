package Finished;
import java.util.*;
public class lkp18c1p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int k = sc.nextInt();
		int [] vals = new int[n];
		for (int i = 0; i < n; i++) {
			vals[i] = sc.nextInt();
			if (i != 0) {
				vals[i] /= vals[0];
			}
		}
		int totCoins = 0;
		if (k % vals[0] != 0) {
			System.out.println(-1);
		}
		else {
			int coins = k / vals[0];
			for (int i = vals.length-1; i > 0; i--) {
				totCoins += coins / vals[i];
				coins -= (coins / vals[i]) * vals[i];
			}
			totCoins += coins;
			System.out.println(totCoins);
		}
	}

}
