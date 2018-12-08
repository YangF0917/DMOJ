package Finished;
import java.util.Scanner;
public class RotatingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String letters = "IOSHZXN";
		int counter = 0;
		String user = sc.nextLine();
		
		for (int i = 0; i < user.length(); i++) {
			if (letters.indexOf(user.charAt(i)) != -1) {
				counter++;
			}
		}
		if (counter == user.length()) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
