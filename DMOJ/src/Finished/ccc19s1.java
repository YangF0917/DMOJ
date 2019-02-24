package Finished;
import java.util.*;
import java.io.*;
public class ccc19s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = 0; int v = 0;
		String a = sc.nextLine();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'H') h++;
			else v++;
		}
		if (v%2 == 0) {
			if (h%2 == 0) {
				System.out.println(1 + " " + 2);System.out.println(3 + " " + 4);
			}
			else {
				System.out.println(3 + " " + 4);System.out.println(1 + " " + 2);
			}
		}
		else {
			if (h%2 == 0) {
				System.out.println(2 + " " + 1);System.out.println(4 + " " + 3);
			}
			else {
				System.out.println(4 + " " + 3);System.out.println(2 + " " + 1);
			}
		}
	}

}
