package Finished;
import java.util.*;
public class dmopc17c3p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num;
		long min = 1000000000;
		num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			long a = sc.nextLong();
			if (a <= min) {
				min = a;
			}
		}
		System.out.println(min);
	}

}
