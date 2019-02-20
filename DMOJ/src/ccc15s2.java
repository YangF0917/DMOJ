import java.util.*;
import java.io.*;
public class ccc15s2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int j = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		HashMap<Character, Integer> u = new HashMap<Character, Integer>(); u.put('S', 0); u.put('M', 1); u.put('L', 2);
		char [] size = new char[j]; int c = 0;
		boolean [] hU = new boolean[j];
		for (int i = 0; i < j; i++) size[i] = br.readLine().charAt(0);
		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			char temp = st.nextToken().charAt(0);
			int inde = Integer.parseInt(st.nextToken()) -1;
			if (u.get(temp) <= u.get(size[inde]) && !hU[inde]) {
				hU[inde] = true; c++;
			}
		}
		System.out.println(c);
	}
}
