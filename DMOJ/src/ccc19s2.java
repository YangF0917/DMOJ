
import java.util.*;
import java.io.*;
public class ccc19s2 {
	public static boolean isP(int a) {
		int fc = 0;
		for (int i = 2; i <= Math.sqrt(a)+1; i++) {
			if (a % i == 0) fc++;
		}
		return fc==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int low = 3; int hi = 2*a-3;
			while (!isP(low) || !isP(hi)) {
				low+=2; hi-=2;
			}
			System.out.println(low + " " + hi);
		}
	}

}
