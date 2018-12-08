package Finished;
import java.util.*;
public class DoubleDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int a = 100;
		int d = 100;
		
		for (int i = 0; i < n; i++) {
			int p1 = sc.nextInt(); int p2 = sc.nextInt();
			if (p1 > p2) d -= p1;
			else if (p1 == p2) d+=0;
			else a -= p2;
		}
		System.out.println(a);
		System.out.println(d);
	}

}
