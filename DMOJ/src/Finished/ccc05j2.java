package Finished;
import java.util.*;
public class ccc05j2 {
	public static boolean isR (int a) {
		int c = 0;
		for (int i = 1; i <= a; i++) if (a%i == 0) c++;
		return c == 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		for (int i = a; i<= b; i++) if (isR(i)) c++;
		System.out.println("The number of RSA numbers between " + a + " and "+b+" is "+c);
	}

}
