package Finished;
import java.util.*;
public class VoteCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String temp = sc.nextLine();
		String b = sc.nextLine();
		int acount = 0;
		
		for (int i = 0; i < a; i++) {
			if (b.charAt(i) == 'A') acount++;
		}
		if (acount > a - acount) System.out.println("A");
		else if (acount < a - acount) System.out.println("B");
		else System.out.println("Tie");
	}

}
