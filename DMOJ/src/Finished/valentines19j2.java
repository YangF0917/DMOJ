package Finished;
import java.util.*;
public class valentines19j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int co = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();int b = sc.nextInt();int c = sc.nextInt();
			if (a <= 255 && a >= 240 && 0 <= b && 200 >= b && 95 <= c && 220>= c) co++;
		}
		System.out.println(co);
	}

}
