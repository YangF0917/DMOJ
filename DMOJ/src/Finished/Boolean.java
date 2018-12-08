package Finished;
import java.util.*;
public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String user = sc.nextLine();
		int nots = 0;
		for (int i = 0; i < user.length(); i += 4) {
			if (user.substring(i).indexOf("not") != -1) {
				nots++;
			}
		}
		
		if (nots % 2 == 0) {
			if (user.indexOf("False") != -1) {
				System.out.println("False");
			}
			else {
				System.out.print("True");
			}
		}
		else {
			if (user.indexOf("False") != -1) {
				System.out.println("True");
			}
			else {
				System.out.print("False");
			}
		}
	}

}
