package Finished;
import java.util.*;
public class nccc7j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] d = new int [26];
		int [] o = new int [26];
		String t = sc.nextLine();
		for (int i = 0; i < t.length(); i++) d[(int)t.charAt(i) - 65] += 1;
		t = sc.nextLine();
		for (int i = 0; i < t.length(); i++) o[(int)t.charAt(i) - 65] += 1;
		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (d[i] > o[i]) count += d[i] - o[i]; 
		}
		System.out.println(count);
	}

}
