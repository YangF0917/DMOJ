package Finished;
import java.util.*;
public class cpc19c1p0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		String[] inps = inp.split(" ");
		int fl = -1;
		int fr = -1;
		for (int i = 0; i < 4; i++) {
			if (inps[i].equals("L") && fl == -1) fl = i;
			else if (inps[i].equals("R") && fr == -1) fr = i;
		}
		boolean [] check = new boolean [4];
		check[fl] = true;
		check[fr] = true;
		System.out.println(fl+1 + " " + (fr+1));
 		for (int i = 0; i < 4; i++) {
			if (!check[i]) System.out.print(i+1 + " ");
		}
		}

}
