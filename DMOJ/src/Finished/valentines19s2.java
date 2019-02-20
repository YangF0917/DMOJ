package Finished;
import java.util.*;
import java.io.*;
public class valentines19s2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = sc.nextInt();
		int q = sc.nextInt();
		HashMap<Integer, Integer> flipx = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> flipy = new HashMap<Integer, Integer>();
		HashMap<String, Integer> coord = new HashMap<String, Integer>();
		for (int i = 0; i < q; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			if (sc.nextInt() == 1) {
				int tempx = sc.nextInt();
				int tempy = sc.nextInt();
				if (flipx.containsKey(tempx)) flipx.put(tempx, flipx.get(tempx) + 1);
				else flipx.put(tempx, 1);
				if (flipy.containsKey(tempy)) flipy.put(tempy, flipy.get(tempy) + 1);
				else flipy.put(tempy, 1);
				if (coord.containsKey(tempx + " " + tempy)) coord.put(tempx + " " + tempy, coord.get(tempx + " " + tempy) + 1);
				else coord.put(tempx + " " + tempy, 1);
			}
			else {
				long flips = 0;
				int x = sc.nextInt();
				int y = sc.nextInt();
				if (flipx.get(x) != null) flips += flipx.get(x);
				if (flipy.get(y) != null) flips += flipy.get(y);
				if (null != coord.get(x + " " + y)) flips -= coord.get(x + " " + y);
				if (flips % 2 == 0) System.out.println(0);
				else System.out.println(1);
			}
		}
	}

}
