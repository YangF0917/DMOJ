import java.util.*;
public class SPFATest {
	public static int v;
	public static int[][] adj;
	public static int[] SPFA(int v, int src) {
		int [] d = new int [v];
		for (int i = 0; i < v; i++) {
			d[i] = Integer.MAX_VALUE;
		}
		d[src] = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(src);
		while (!q.isEmpty()) {
			int temp = q.poll();
			for (int i = 0; i < v; i++) {
				if (d[i] > d[temp] + adj[temp][i] && adj[temp][i] != -1) {
					d[i] = d[temp] + adj[temp][i];
					if (!q.contains(i)) q.add(i);
				}
			}
		}
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		v = sc.nextInt();
		adj = new int[v][v];
		for (int i = 0; i < v; i++) for (int j = 0; j < v; j++) adj[i][j] = -1;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int w = sc.nextInt();
			adj[a][b] = w; adj[b][a] = w;
		}
		System.out.println(Arrays.toString(SPFA(v, 1)));
	}

}
