package Finished;
import java.util.Scanner;
public class FractionAction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int num = a - (a/b) * b;
		int den = b;
		int gcf = 1;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0 && den % i == 0) gcf = i;
		}
		if (num == 0) System.out.println(a/b);
		else if (a/b == 0) System.out.println(num/gcf + "/" + den/gcf);
		else System.out.println(a/b + " " + num/gcf + "/" + den/gcf);
	}

}
