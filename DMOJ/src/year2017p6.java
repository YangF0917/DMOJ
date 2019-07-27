import java.util.*;
import java.io.*;
public class year2017p6 {
	public static int [][]dp;
	public static int n;
	public static int [][] d;
	public static int cost(int curr, int max) {
		if (max >= n) return 0;
		else if (max < curr) return 0;
		else if (max == curr) return d[curr][1] + cost(curr+1, max + d[curr][0]);
		else {
			return dp[curr][max] = d[curr][0] + (cost(curr + 1, max) + cost(curr + 1, max + d[curr][1]));
		}
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		d = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			d[i][0] = Integer.parseInt(st.nextToken());
			d[i][1] = Integer.parseInt(st.nextToken());
		}
		dp = new int [n][n];
		System.out.println(dp[0][0]);
		System.out.println(cost(0, 0));
	}

}
