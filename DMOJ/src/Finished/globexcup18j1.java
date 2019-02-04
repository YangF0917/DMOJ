package Finished;
import java.util.*;
public class globexcup18j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int up = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double myNum = sc.nextDouble();
			if (Math.floor(myNum * 2) != Math.floor(myNum) * 2) {
				up++;
			}
		}
		System.out.println(up);
		System.out.println(n-up);
	}

}
