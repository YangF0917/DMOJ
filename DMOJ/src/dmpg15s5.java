import java.util.*;
import java.io.*;
public class dmpg15s5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Boolean> bo = new HashMap<>();
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			for (int j = x; j < x+w; j++) {
				for (int k = y; k < y+h; k++) {
					if (bo.get(j + " " + k) == null) bo.put(j + " " + k, true);
					else bo.remove(j + " " + k);
				}
			}
		}
		System.out.println(bo.size());
	}

}
