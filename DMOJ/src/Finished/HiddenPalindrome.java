package Finished;
import java.util.*;
public class HiddenPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String user = sc.nextLine();
		int max = 1;
		while (user.length() != 0) {
		for (int i = 0; i < user.length(); i++) {
			if (isPalindrome(user.substring(i)) && user.substring(i).length() > max) max = user.substring(i).length();
		}
		user = user.substring(0, user.length()-1);
		}
		System.out.println(max);
	}
	public static boolean isPalindrome (String str) {
		//wasitacatisaw
		if (str.length() == 1 || str.length() == 0) return true;
		else if (str.charAt(0) == str.charAt(str.length()-1)) return isPalindrome(str.substring(1, str.length()-1));
		return false;
	}

}

