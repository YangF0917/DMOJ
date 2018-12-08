package Finished;
import java.util.Scanner;
public class BigBangSecrets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		String b = sc.nextLine();
		String user = sc.nextLine();
	
		for (int i = 0; i < user.length(); i++) {
			int ascii = (int)user.charAt(i) - 3*(i+1) - k;
			if ((int)user.charAt(i) - 3*(i+1) - k < (int)('A')) {
				while (ascii < (int)'A') {
					ascii+= 26;
				}
				System.out.print((char)(ascii));
			}
			else {
				System.out.print((char)((int)user.charAt(i) - 3*(i+1) - k));
			}
		}
	}

}
