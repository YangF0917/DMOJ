import java.util.*;
import java.io.*;
public class ccc19s5 {
	public static int n;
	public static int end;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()) + 1;
		int m = Integer.parseInt(st.nextToken());
		int [] pho = new int [m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) pho[i] = Integer.parseInt(st.nextToken());
		
	}

}
