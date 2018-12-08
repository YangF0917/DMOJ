import java.io.*;
public class TestingBufferedReaders {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String c = br.readLine();
		System.out.println(c);
		
		int a = Integer.parseInt(br.readLine());
		System.out.println(a);
	}

}
