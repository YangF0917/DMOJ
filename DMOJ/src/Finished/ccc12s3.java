package Finished;
import java.util.*;
public class ccc12s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> f = new HashMap<Integer, Integer>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if (f.get(temp) == null) f.put(temp, 1);
			else f.put(temp, f.get(temp) + 1);
		}
		int [] max = new int[2];
		for (int a: f.keySet()) {
			if (f.get(a) > max[0] && f.get(a) > max[1]) {
				if (max[0] < max[1]) max[0] = f.get(a);
				else max[1] = f.get(a);
			}
			else if (f.get(a) > max[0]) {
				max[0] = f.get(a);
			}
			else if (f.get(a) > max[1]) max[1] = f.get(a);
		}
		Arrays.sort(max); boolean tmax = false; int abs = -1;
		LinkedList<Integer> nums = new LinkedList<Integer>();
		for (int a: f.keySet()) if (f.get(a) == max[1]) nums.add(a);
		if (nums.size() < 2) {
			tmax = true; abs = nums.get(0);
			for (int a: f.keySet()) if (f.get(a) == max[0]) nums.add(a);
		}
		if (!tmax) {
		int hi = nums.get(0); int low = nums.get(0);
		for (int i = 1; i < nums.size(); i++) {
			if (nums.get(i) > hi) hi = nums.get(i);
			else if (nums.get(i) < low) low = nums.get(i);
		}
		System.out.println(hi-low);
		}
		else {
			int maxd = 0;
			for (int i = 0; i < nums.size(); i++) {
				if (Math.abs(nums.get(i) - abs) > maxd) maxd = Math.abs(nums.get(i) - abs);
			}
			System.out.println(maxd);
		}
	}

}
