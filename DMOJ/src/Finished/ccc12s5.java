package Finished;
import java.util.*;
public class ccc12s5 {
	public static HashMap<String, Integer>memoize = new HashMap<String, Integer>();
	public static int paths(int x, int y, int[][] g) {
		if (x < 0 || y < 0) return 0;
		else if (memoize.get(x + " " + y) != null) {
			return memoize.get(x + " " + y);
		}
		else if (g[x][y] == -1) return 0;
		else if (x == 0 && y == 0) return 1;
		else{
			memoize.put(x + " " + y, paths(x-1,y,g) + paths(x,y-1,g));
			return memoize.get(x + " " + y);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int m = sc.nextInt();
		int[][] grid = new int[n][m];
		int temp = sc.nextInt();
		for (int i = 0; i < temp; i++) grid[sc.nextInt()-1][sc.nextInt()-1] = -1;
		System.out.println(paths(n-1,m-1,grid));
	}

}
