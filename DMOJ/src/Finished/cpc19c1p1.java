package Finished;
import java.util.*;
public class cpc19c1p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int lp = 1;
		int rp = inp;
		boolean lm = false;
		while (lp <= rp) {
			if (!lm) {
				System.out.print(rp + " ");
				rp--; lm = true;
			}
			else {
				System.out.print(lp + " ");
				lp++; lm = false;
			}
		}
	}

}
