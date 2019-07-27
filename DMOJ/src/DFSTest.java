import java.util.*;
import java.io.*;
public class DFSTest {
	public static int v;
	public static int DFS() {
		return -1;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		v = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		LinkedList<Integer>[] adj = new LinkedList[v];
		for (int i = 0; i < v; i++) adj[i] = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().split(" ");
			int a = Integer.parseInt(t[0]); int b = Integer.parseInt(t[1]);
			adj[a].add(b);
			// For bidirecional graphs
			adj[b].add(a);
		}
	}

}
