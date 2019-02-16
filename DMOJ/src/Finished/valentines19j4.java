package Finished;
import java.util.*;
public class valentines19j4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][]flowers = new int [n][2];
		boolean [][]ct = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			flowers[i][0] = sc.nextInt();
			flowers[i][1] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			ct[x-1][y-1] = true;
			ct[y-1][x-1] = true;
		}
		long max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					long value = 0;
					value = value * flowers[i][0] + flowers[i][1];
					if (i != j) value = value * flowers[j][0] + flowers[j][1];
					if (k != j && k!= i)value = value * flowers[k][0] + flowers[k][1];
					if (value > max && !ct[i][j] && !ct[j][k] && !ct[k][i]) max = value;
				}
			}
		}
		System.out.println(max);
	}

} 