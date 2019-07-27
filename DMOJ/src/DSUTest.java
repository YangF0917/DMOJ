import java.util.*;
import java.io.*;
public class DSUTest {
	public static boolean [][] adj;
	public static LinkedList<Integer>[] parent;
	public static boolean DSU(int v, int src) {
		int prev = src;
		int [] count = new int [v];
		for (int i = 0; i < v; i++) {
			
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		adj = new boolean[v][v];
		parent = new LinkedList[v];
		System.out.println(Arrays.toString(parent));
		int n = sc.nextInt();
		for (int i = 0; i < n ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adj[a][b] = true; adj[b][a] = true;
		}
		
	}

}
