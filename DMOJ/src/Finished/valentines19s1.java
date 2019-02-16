package Finished;
import java.util.*;
public class valentines19s1 {
	public static int find (String[] k, String key) {
		for (int i = 0; i < k.length; i++) {
			if (k[i].equals(key)) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> done = new ArrayList<Integer>();
		int n = sc.nextInt();
		String[] c = new String[n];
		int m = sc.nextInt();
		int [] vC = new int[n];
		int[][] votes = new int[m][n+1];
		int [] curr = new int[m];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextLine();
		}
		for (int i = 0; i < m; i++) {
			String[] v = sc.nextLine().split(" ");
			for (int j = 0; j < Integer.parseInt(v[0]); j++) {
				String key = v[j+1];
				votes[i][j] = find(c, key);
			}
			votes[i][Integer.parseInt(v[0])] = -1;
		}
		for (int i = 0; i < n-1; i++) {
			vC = new int[n];
			for (int j = 0; j < m; j++) {
				if (votes[j][curr[j]] != -1) vC[votes[j][curr[j]]]++;
			}
			ArrayList<Integer> minIndex = new ArrayList<Integer>();
			int minVotes = Integer.MAX_VALUE;
			for (int j = 0; j < n; j++) {
				if (vC[j] < minVotes && !done.contains(j)) {
					minIndex = new ArrayList<Integer>();
					minIndex.add(j);
					minVotes = vC[j];
				}
				else if (vC[j] == minVotes && !done.contains(j)) {
					minIndex.add(j);
				}
			}
			minIndex.sort(null);
			done.add(minIndex.get(0));
			for (int j = 0; j < m; j++) {
				if (votes[j][curr[j]] == minIndex.get(0)) {
					curr[j]++;
					while (votes[j][curr[j]] != -1 && done.contains(votes[j][curr[j]])) curr[j]++;
				}
			}
		}
		int dneIndex = -1;
		for (int i = 0; i < n; i++) {
			if (!done.contains(i)) dneIndex = i;
		}
		System.out.println(c[dneIndex]);
	}

}
