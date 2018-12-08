import java.util.*;
public class RGPC18P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n % m == 0) { System.out.println("yes "+ n/m);}
		else {
			int more = 0;
			for (int i = m; i <= n; i++) {
				if (n % i == 0) {more = i;break;}
			}
			System.out.println("no "+ (more-m));
		}
	}

}
