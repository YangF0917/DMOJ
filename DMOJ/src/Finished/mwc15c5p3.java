package Finished;
import java.util.*;
import java.io.*;
public class mwc15c5p3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String, Integer> f = new HashMap<String, Integer>();
		int c = 0;
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) f.put(st.nextToken(), 1);
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			String t = st.nextToken();if (f.get(t) != null) if (f.get(t) > 0) {
				c++; f.remove(t);
			}
		}System.out.println(c);
	}

}
