package Finished;
import java.util.Scanner;
public class SixteenBitSWOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String holding = "";
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long p = sc.nextLong();
			if ((long)a * b == p) System.out.println("POSSIBLE DOUBLE SIGMA");
			else System.out.println("16 BIT S/W ONLY");
		}
	}

}
