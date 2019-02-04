package Finished;
import java.util.*;
public class lkp18c2p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] lines = new int [n];
		for (int i = 0; i < n; i++) {
			lines[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			Arrays.sort(lines);
			System.out.println(lines[0]);
			lines[0]++;
		}
	}

}
