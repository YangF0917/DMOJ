package Finished;
import java.util.*;
public class nccc7s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.print(a*b/2);
		if (a%2 == 1 && b%2 == 1) {
			System.out.println(".5");
		}
		else {
			System.out.println(".0");
		}
	}

}
