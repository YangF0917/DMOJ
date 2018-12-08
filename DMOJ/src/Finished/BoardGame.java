package Finished;
import java.util.*;
public class BoardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		int max = 0;
		int consL = 0; int totalL = 0;
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) == 'L') {
				consL++;totalL++;
				if (consL > max) max = consL;
			}
			else if (user.charAt(i) == ' ') {}
			else {
				consL = 0;
			}
		}
		System.out.println(totalL + " " + max);
	}

}
