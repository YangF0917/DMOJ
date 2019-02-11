package Finished;
import java.util.*;
public class ccc18j5 {
	public static int[] bfs(boolean[][]g, int n, LinkedList<Integer> last) {
		Queue<Integer> next = new LinkedList<Integer>();
		int[] dict = new int[n];
		for (int i = 1; i < n; i++) {
			dict[i] = Integer.MAX_VALUE;
		}
		next.add(1);
		dict[1] = 0;
		while (!next.isEmpty()) {
			int curr = next.poll();
			for (int i = 1; i < n; i++) {
				if (1 + dict[curr] < dict[i] && g[curr][i]) {
					dict[i] = 1 + dict[curr];
					next.add(i);
				}
			}
		}
		return dict;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int page = sc.nextInt();
		LinkedList<Integer> last = new LinkedList<Integer>();
		boolean [][] book = new boolean [page+1][page+1];
		for (int i = 1; i < page + 1; i++) {
			int n = sc.nextInt();
			if (n == 0) last.add(i);
			for (int j = 0; j < n; j++) {
				book[i][sc.nextInt()] = true;
			}
		}
		int[] dist = bfs(book, page + 1, last);
		int min = Integer.MAX_VALUE;
		for (int i: last) {
			if (dist[i] < min) min = dist[i];
		}
		boolean canVis = true;
		for (int i = 1; i < page+1; i++) {
			if (dist[i] == Integer.MAX_VALUE) canVis = false;
		}
		if (canVis) System.out.println("Y");
		else System.out.println("N");
		System.out.println(min+1);
	}

}
