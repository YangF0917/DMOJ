import java.util.*;

public class GraphTheory {

	private static int [][] adjMatrix;
	public GraphTheory(int a) {
		adjMatrix = new int [a][a];
	}
	public static int[] spf(int start,int end) {
		Queue<Integer> q = new LinkedList<Integer>();
		int [] values = new int [adjMatrix.length];
		for (int i = 0; i < values.length; i++) {
			values[i] = Integer.MAX_VALUE;
		}
		q.add(start);
		values[start] = 0;
		while (!q.isEmpty()) {
			int currentNode = q.poll();
			for (int i = 0; i < adjMatrix.length; i++) {
				if (adjMatrix[currentNode][i] != 0 && values[currentNode] + adjMatrix[currentNode][i] < values[i]) {
					values[i] = values[currentNode] + adjMatrix[currentNode][i];
					if (!q.contains(i)) {
						q.add(i);
					}
				}
			}
		}
		return values;
	}
	public void setEdges (int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int weight = sc.nextInt();
			adjMatrix[a][b] = weight;
			adjMatrix[b][a] = weight;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GraphTheory test = new GraphTheory(5);
		test.setEdges(7);
		System.out.println(Arrays.toString(test.spf(0, 3)));
	}

}
