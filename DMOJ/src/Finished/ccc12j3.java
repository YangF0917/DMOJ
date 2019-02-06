package Finished;
import java.util.*;
public class ccc12j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] icon = {"*x*"," xx", "* *"};
		int a = sc.nextInt();
		for (int i = 0; i < 3 * a; i++) {
			for (int j = 0; j < 3 * a; j++) {
				System.out.print(icon[i/a].charAt(j/a));
			}
			System.out.println();
		}
	}

}
