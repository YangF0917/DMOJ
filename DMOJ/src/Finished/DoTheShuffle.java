package Finished;
import java.util.*;
public class DoTheShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Question 1: Do the Shuffle
		String mp3 = "ABCDE";
		String temp;
		
		int button = 0;
		int times = 0;
		
		while (button != 4) {
			button = sc.nextInt();
			times = sc.nextInt();
			if (button == 1) {
				for (int i = 0; i < times; i++) {
					temp = mp3.substring(1) + mp3.charAt(0);
					mp3 = temp;
				}
			}
			else if (button == 2) {
				for (int i = 0; i < times; i++) {
					temp = "" + mp3.charAt(4) + mp3.substring(0, 4);
					mp3 = temp;
				}
			}
			else if (button == 3) {
				for (int i = 0; i < times; i++) {
					temp = ""+ mp3.charAt(1) + mp3.charAt(0) + mp3.substring(2);
					mp3 = temp;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(mp3.charAt(i) + " ");
		}
	}

}
