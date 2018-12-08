package Finished;
import java.util.*;
public class MockingSpongebob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nonlits = " 1234567890`~!@#$%^&*();:,<.>/?;:'\"\\|][}{=+_-";
		int n = sc.nextInt(); sc.nextLine();
		for (int i = 0; i < n; i++) {
			String user = sc.nextLine();
			boolean lower = true;
			String out = "";
			for (int j = 0; j < user.length(); j++) {
				if (nonlits.indexOf(user.charAt(j)) != -1) {out += user.charAt(j);}
				else if (lower) {
					out += (user.toLowerCase().charAt(j)); lower = false;
				}
				else {
					out += (user.toUpperCase().charAt(j)); lower = true;
				}
			}
			System.out.println(out);
		}
	}

}
