package Finished;
import java.util.*;
public class Infinity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		long anum = Integer.parseInt(a, 16);
		long bnum = Integer.parseInt(b, 16);
		if (anum + bnum > 1061109567) System.out.println("Yes");
		else System.out.println("No");
	}

}
