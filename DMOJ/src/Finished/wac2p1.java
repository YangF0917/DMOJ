package Finished;
import java.util.*;
public class wac2p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		switch (inp) {
		case ("Monday"):
			System.out.println("Tuesday"); break;
		case ("Tuesday"):
			System.out.println("Wednesday"); break;
		case ("Wednesday"):
			System.out.println("Thursday"); break;
		case ("Thursday"):
			System.out.println("Friday"); break;
		case ("Friday"):
			System.out.println("Saturday"); break;
		case ("Saturday"):
			System.out.println("Sunday"); break;
		case ("Sunday"):
			System.out.println("Monday"); break;
		}
	}

}
