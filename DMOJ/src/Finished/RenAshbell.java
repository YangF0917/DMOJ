package Finished;
import java.util.Scanner;
public class RenAshbell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int loop = sc.nextInt();
		int f;
		boolean greaterthan = true;
		
		f = sc.nextInt();
		for (int i = 1; i < loop; i++) {
			if (f <= sc.nextInt()) greaterthan = false;
		}
		if (greaterthan) System.out.println("YES");
		else System.out.println("NO");
	}

}
