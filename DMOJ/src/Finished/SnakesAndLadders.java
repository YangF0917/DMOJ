package Finished;
import java.util.*;
public class SnakesAndLadders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int userplace = 1;
		int userRoll = 1;
		while (userplace != 100 && userRoll != 0) {
			userRoll = sc.nextInt();
			if (100 - userplace >= userRoll) {
				userplace += userRoll;
			}
			if (userplace == 54) {
				userplace = 19;
			}
			if (userplace == 90) {
				userplace = 48;
			}
			if (userplace == 99) {
				userplace = 77;
			}
			if (userplace == 9) {
				userplace = 34;
			}
			if (userplace == 40) {
				userplace = 64;
			}
			if (userplace == 67) {
				userplace = 86;
			}
			if (userRoll != 0) {
				System.out.println("You are now on square " + userplace);
				if (userplace == 100) {
					System.out.println("You Win!");
				}
			}
			if (userRoll == 0) {
				System.out.println("You Quit!");
			}
		}
	}

}
