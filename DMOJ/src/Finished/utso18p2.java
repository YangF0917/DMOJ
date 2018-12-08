package Finished;
import java.util.*;
public class utso18p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
		int [] as = {a,b,c};
		boolean [] cT = {false, false, false};
		for (int i = 0; i < 3; i++) {
			int d = sc.nextInt();
			if (i == 0) {
				if (d == as[2]) { cT[i] = true;}
			}
			else {
				if (d == as[i-1]) { cT[i] = true;}
			}
		}
		a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
		int [] cS = {a,b,c};
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			if (cT[i] == true) {
				if (cS[i] > 0) { sum += cS[i];}
			}
		}
		System.out.println(sum);
	}

}
