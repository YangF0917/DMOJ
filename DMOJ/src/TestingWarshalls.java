import java.util.*;
public class TestingWarshalls {
	int [][] weights;
	boolean [][] hasEdge;
	int v;
	public TestingWarshalls(int v) {
		weights = new int [v][v];
		hasEdge = new boolean[v][v];
		this.v = v;
	}
	public void addEdge(int a, int b, int weight) {
		weights[a][b] = weight;
		weights[b][a] = weight;
		hasEdge[a][b] = true;
		hasEdge[b][a] = true;
	}
	public void dijikstras(int src, int destin) {
		int [] distances = new int[v];
		boolean [] set = new boolean[v];
		for (int i = 0; i < v; i++) {
			distances[i] = Integer.MAX_VALUE;
			set[i] = false;
		}
		set[destin] = true;
		distances[destin] = 0;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}
}
