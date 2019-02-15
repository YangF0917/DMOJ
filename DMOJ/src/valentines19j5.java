import java.util.*;
import java.io.*;
public class valentines19j5 {

	public static long ncr(long n) {
		return n*(n-1)/2;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Long, Long> s = new HashMap<Long, Long>();
		HashMap<String, Long> dup = new HashMap<String, Long>();
		long n = Integer.parseInt(br.readLine());
		long total = (n*n-n)/2;
		//for each pair of same slope, -1 answer from 1+2+3 for n = 4
		for (int i = 0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			long slope = Integer.parseInt(temp[0]);
			long inte = Integer.parseInt(temp[1]);
			if (s.get(slope) == null) {
				s.put(slope, 1l);
			}
			else s.replace(slope, s.get(slope) + 1);
			if (dup.get(slope + " " + inte) == null) {
				dup.put((slope + " " + inte), 1l);
			}
			else dup.replace((slope + " " + inte), dup.get((slope + " " + inte)) + 1);
		}
		for (long i: s.keySet()) {
			total -= ncr(s.get(i));
		}
		for (String p: dup.keySet()) {
			total += ncr(dup.get(p));
		}
		System.out.println(total);
	}

}