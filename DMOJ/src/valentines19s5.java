import java.util.*;
public class valentines19s5 {
	public static boolean bfs(boolean [][]g, Queue<Integer> o, int n) {
		boolean []hasVisited = new boolean[n];
		Queue<Integer> next = new LinkedList<Integer>();
		next.add(o.poll());
		boolean canVis = true;
		while (!next.isEmpty()) {
			int nextNode = o.peek();
			int curr = next.poll();
			for (int i = 0; i < n; i++) {
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		boolean[][] g = new boolean[n][n];
		for (int i = 0; i < n-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			g[a][b] = true;
			g[b][a] = true;
		}
		sc.nextLine();
		for (int i = 0; i < q; i++) {
			String[] v = sc.nextLine().split(" ");
			Queue<Integer> o = new LinkedList<Integer>();
			for (int j = 1; j < v.length; j++) {
				o.add(Integer.parseInt(v[j]));
			}
			if (bfs(g, o, n)) System.out.println(1);
			else System.out.println(0);
		}
	}

}
