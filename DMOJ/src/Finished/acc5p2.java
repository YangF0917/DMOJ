package Finished;
import java.util.*;
public class acc5p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String d = "DMOJ";
		int max = 0;
		/*
		 * "DO" --> 2
		 * "MJ" --> 2
		 * "DJ" --> 2
		 * "DMJ" --> 1
		 * "DOJ" --> 1
		 */
		if (s.equals("DMOJ")) max = 4;
		else if (s.contains("DMJ")) max = 3;
		else if (s.contains("DOJ")) max = 3;
		else if (s.contains("DO")) max = 2;
		else if (s.contains("MJ")) max = 2;
		else if (s.contains("DJ")) max = 2;
		String curr = "";
		for (int i = 0; i < s.length(); i++) {
			if (d.indexOf(curr+s.charAt(i)) != -1) curr += s.charAt(i);
			else curr = "" + s.charAt(i);
			if (curr.length() > max) max = curr.length();
		}
		System.out.println(4-max);
	}

}
