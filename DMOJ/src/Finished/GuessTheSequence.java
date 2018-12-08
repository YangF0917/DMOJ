package Finished;
import java.util.*;
public class GuessTheSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = "";
// Sequence:
/*
1
3
3
2
2
1
3
3
3
1
2
3
1
1
1
*/
		for (int j = 0; j < 15; j++) {
			for (int i = 1; i <= 3; i++) {
				System.out.println(i);
				input = sc.nextLine();
				if (input.equals("YES")) break;
			}
		}
	}
}
