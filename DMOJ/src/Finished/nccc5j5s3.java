package Finished;
import java.util.*;
import java.io.*;
public class nccc5j5s3 {
	public static boolean[][] g;
	public static int n;
	public static boolean bfs() {
		boolean[] hV = new boolean [n];
		Queue<Integer> next = new LinkedList<Integer>();
		next.add(1);
		while (!next.isEmpty()) {
			int curr = next.poll(); hV[curr] = true;
			for (int i = 0; i < n; i++) {
				if (g[curr][i] && !hV[i] && !next.contains(i)) next.add(i);
			}
		}
		return hV[n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt() + 1; int m = sc.nextInt();
		g = new boolean[n][n]; int [][] edge = new int [m][2];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt(); int b = sc.nextInt();
			g[a][b] = true; edge[i][0] = a; edge[i][1] = b;
		}
		for (int i = 0; i < m; i++) {
					g[edge[i][0]][edge[i][1]] = false;
					if (bfs()) System.out.println("YES");
					else System.out.println("NO");
					g[edge[i][0]][edge[i][1]] = true;
		}
	}

}
