package Finished;
import java.util.*;
import java.io.*;
public class ccc13s4 {
	// Switch to adjacency lists instead of matrix
	public static boolean bfs(int source, ArrayList<Integer>[] graph, int dest, int num) {
		Queue<Integer> next = new LinkedList<Integer>();
		boolean[] hasVis = new boolean [num];
		next.add(source);
		while (!next.isEmpty()) {
			int current = next.poll();
			hasVis[current] = true;
			for (int i: graph[current]) if (!hasVis[i]) next.add(i);
			
		}
		return hasVis[dest];
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]) + 1;
		int m = Integer.parseInt(temp[1]);
		ArrayList<Integer> [] graph = new ArrayList[n];
		for (int i = 0; i < n; i++) graph[i] = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			temp = br.readLine().split(" ");
			graph[Integer.parseInt(temp[0])].add(Integer.parseInt(temp[1]));
		}
		temp = br.readLine().split(" ");
		int x = Integer.parseInt(temp[0]); int y = Integer.parseInt(temp[1]);
		if (bfs(x, graph, y, n)) System.out.println("yes");
		else if (bfs(y, graph, x, n)) System.out.println("no");
		else System.out.println("unknown");
	}

}
