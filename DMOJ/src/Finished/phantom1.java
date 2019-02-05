package Finished;
import java.util.*;
public class phantom1 {
	public static boolean isPrime(int a) {
		int counter = 0;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) counter++;
		}
		if (counter == 0 && a != 1) return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int count = 0;
			for (int j = a; j < b; j++) {
				if (isPrime(j)) count++;
			}
			System.out.println(count);
		}
	}

}
