package Finished;
import java.util.Scanner;
public class Rövarspråket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// a = 97, e = 101, i = 105, o = 111, u = 117, z = 122
		String user = sc.nextLine();
		String translated = "";
		
		for (int i = 0; i < user.length(); i++) {
			if ((int)user.charAt(i) == 97 || (int)user.charAt(i) == 101 || (int)user.charAt(i) == 105
					|| (int)user.charAt(i) == 111 || (int)user.charAt(i) == 117) {
				translated += user.charAt(i);
			}
			else {
				translated += user.charAt(i);
				if ((int)user.charAt(i) >= 97 && (int)user.charAt(i) <= 99) translated += (char)97;
				else if ((int)user.charAt(i) >= 100 && (int)user.charAt(i) <= 103) translated += (char)101;
				else if ((int)user.charAt(i) >= 104 && (int)user.charAt(i) <= 108) translated += (char)105;
				else if ((int)user.charAt(i) >= 109 && (int)user.charAt(i) <= 114) translated += (char)111;
				else translated += (char)117;
				if ((int)user.charAt(i)+1 == 101 || (int)user.charAt(i)+1 == 105
					|| (int)user.charAt(i)+1 == 111 || (int)user.charAt(i)+1 == 117) {
					translated += (char)((int)user.charAt(i) + 2);
				}
				else if (user.charAt(i) != 'z') translated += (char)((int)user.charAt(i) + 1);
				else translated += "z";
			}
		}
		System.out.println(translated);
	}

}
