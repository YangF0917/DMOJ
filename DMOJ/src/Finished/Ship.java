package Finished;
import java.util.Scanner;
public class Ship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String [] shipparts = {"B", "F", "T", "L", "C"};
		String user = sc.nextLine();
		int counter = 0;
		
		for (int i = 0; i < 5; i++) {
			if (user.indexOf(shipparts[i]) == -1) System.out.println(shipparts[i]);
			else counter++;
		}
		if (counter == 5) {
			System.out.println("NO MISSING PARTS");
		}
	}

}
