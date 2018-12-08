package Finished;
import java.util.*;
public class DDRP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String seq = sc.nextLine();
		if (seq.charAt(0) != seq.charAt(1) && seq.charAt(2) != seq.charAt(1) && seq.charAt(0) != seq.charAt(2)) {
			// Check 1st and last
			if ((seq.charAt(0) == 'U' && seq.charAt(2) == 'D') || (seq.charAt(0) == 'D' && seq.charAt(2) == 'U')) System.out.println("Candle");
			else if ((seq.charAt(0) == 'L' && seq.charAt(2) == 'R') || (seq.charAt(0) == 'R' && seq.charAt(2) == 'L')) System.out.println("Crossover");
			else System.out.println("Neither");
		}
		else System.out.println("Neither");
	}

}
