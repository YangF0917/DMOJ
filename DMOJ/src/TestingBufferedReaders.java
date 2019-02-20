import java.io.*;
import java.util.*;
public class TestingBufferedReaders {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			System.out.println(a);
		}
		String c = br.readLine();
		System.out.println(c);
		
		int a = Integer.parseInt(br.readLine());
		System.out.println(a);
	}

}
