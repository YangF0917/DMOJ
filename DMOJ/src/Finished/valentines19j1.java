package Finished;
import java.util.*;
public class valentines19j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			long score = sc.nextLong();
			if (score < 1000) System.out.println("Newbie");
			else if (score >= 1000 && score <= 1199) System.out.println("Amateur");
			else if (score >= 1200 && score <= 1499) System.out.println("Expert");
			else if (score >= 1500 && score <= 1799) System.out.println("Candidate Master");
			else if (score >= 1800 && score <= 2199) System.out.println("Master");
			else if (score >= 2200 && score <= 2999) System.out.println("Grandmaster");
			else if (score >= 3000 && score <= 3999) System.out.println("Target");
			else System.out.println("Rainbow Master");
		}
	}

}
