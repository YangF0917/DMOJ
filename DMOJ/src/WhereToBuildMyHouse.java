import java.util.*;
public class WhereToBuildMyHouse {
	public static int aC = 0;
	public static int max = Integer.MIN_VALUE;
	public static int temp = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		long l = sc.nextLong() + 1;
		int n = sc.nextInt();
		LinkedList<Integer> starts = new LinkedList<Integer>();
		LinkedList<Integer> river = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt(); starts.add(a); river.add(a); river.add(sc.nextInt());
		}
		Collections.sort(starts); Collections.sort(river);
		for (int a: river) {
			if (aC == 0 && max < a - temp) {
				max = a - temp;
			}
			if (aC == 0) temp = a;
		}
	}
// create a temp array for expressing the numbr of strt and end nodes and compress
}
