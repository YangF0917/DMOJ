package Finished;
import java.util.*;
import java.io.*;
public class ccc01s3 {
	public static boolean bfs(int[][] graph) {
		Queue<Integer> next = new LinkedList<Integer>();
		next.add(0);
		boolean [] canVisit = new boolean[26];
		while (!next.isEmpty()) {
			int current = next.poll();
			canVisit[current] = true;
			for (int i = 0; i < 26; i++) {
				if (graph[current][i] == 1 && canVisit[i] == false) {
					next.add(i);
				}
			}
		}
		return canVisit[1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] roads = new int[26][26];
		String input = sc.nextLine();
		while (!input.equals("**")) {
			roads[(int)input.charAt(0) - 65][(int)input.charAt(1) - 65] = 1;
			roads[(int)input.charAt(1) - 65][(int)input.charAt(0) - 65] = 1;
			input = sc.nextLine();
		}
		int counter = 0;
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < i; j++) {
				if (roads[i][j] == 1) {
					roads[i][j] = 0;
					roads[j][i] = 0;
					if (!bfs(roads)) {
						counter++;
						System.out.println("" + ((char)(i+65)) + ((char)(j+65)));
					}
					roads[i][j] = 1;
					roads[j][i] = 1;
				}
				
			}
		}
		System.out.println("There are "+ counter + " disconnecting roads.");
	}

}
