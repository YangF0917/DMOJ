import java.util.*;
import java.io.*;
public class tle16c6s1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		HashMap<String, LinkedList<Integer>> bc = new HashMap<>();
		HashMap<Integer, String> ord = new HashMap<Integer, String>();
		for (int i = 0; i < t; i++) {
			String temp = br.readLine();ord.put(i, temp);
			bc.put(temp, new LinkedList<Integer>());
		}
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			bc.get(temp).add(i+1);
		}
		for (int b: ord.keySet()) for (int a: bc.get(ord.get(b))) System.out.println(a);
	}
}
