package Finished;
import java.util.*;
public class ppwindsor18p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String [] row = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
		int count = 0;
		for (int i = 0; i < n; i++) {
			String user = sc.nextLine();
			boolean flg = true;
			int index = 0;
			if (row[1].indexOf(user.charAt(0)) != -1) {
				index = 1;
			}
			else if (row[2].indexOf(user.charAt(0)) != -1) {
				index = 2;
			}
			for (int j = 1; j < user.length(); j++) {
				if (row[index].indexOf(user.charAt(j)) == -1) {flg = false;}
			}
			if (flg) {
				count++;
			}
		}
		System.out.println(count);
	}
}
