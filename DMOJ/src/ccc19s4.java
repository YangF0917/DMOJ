import java.util.*;
import java.io.*;
public class ccc19s4 {
	public static int v (int[] a, LinkedList<Integer> ind) {
		int sum = 0; int count = 0;
		while (count < a.length) {
			count = ind.pop();
			if (ind.isEmpty()) {
				
			}else {
				int next = ind.peekFirst();
			}
		}
		return 0;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int [] values = new int [n];
		for (int i = 0; i < n; i++) {
			values[i] = Integer.parseInt(st.nextToken());
		}
		if (n%3 == 0) {
			
		}
		else if (n%3 == 1) {
			//Largest value in a set of 2
		}
		else {
			
		}
	}
}
