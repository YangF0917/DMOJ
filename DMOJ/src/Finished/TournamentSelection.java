package Finished;
import java.util.*;
public class TournamentSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int wCount = 0;
		for (int i = 0; i < 6; i++) {
			String a = sc.nextLine();
			if (a.equals("W")) wCount++;
		}
		if (wCount == 0) System.out.println(-1);
		else if (wCount > 0 && wCount <= 2) System.out.println(3);
		else if (wCount > 2 && wCount <= 4) System.out.println(2);
		else System.out.println(1);
	}

}
