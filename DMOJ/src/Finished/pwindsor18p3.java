package Finished;
import java.util.*;
public class pwindsor18p3 {
	public static boolean isPrime(int a) {
		int count = 0;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) count++;
		}
		if (count == 0) return false;
		else return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (isPrime(sc.nextInt())) {
				count++;
			}
		}
		System.out.println(count);
	}

}
