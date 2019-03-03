package Finished;
import java.util.*;
public class ccc06j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine(); int s = 0;
		int last = -1;
		String [] p = {"abc","def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
		while (!t.equals("halt")) {
			for (int j = 0; j < t.length(); j++) {
			if (last != -1) {
				for (int i = 0; i < 8; i++) {
					if (p[i].contains(""+t.charAt(j)) && i != last) {
						s+= p[i].indexOf(""+t.charAt(j)) + 1; last = i;
					}
					else if (p[i].contains(""+t.charAt(j))) {
						s += 2+p[i].indexOf(""+t.charAt(j)) + 1; last = i;
					}
				}
			}
			else {
				for (int i = 0; i < 8; i++) {
					if (p[i].contains(""+t.charAt(j)) && i != last) {
						s+= p[i].indexOf(""+t.charAt(j)) + 1; last = i;
					}
				}
			}
			}
			System.out.println(s); s = 0; t = sc.nextLine(); last = -1;
		}
	}

}
