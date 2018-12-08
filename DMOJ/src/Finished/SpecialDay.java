package Finished;
import java.util.Scanner;

public class SpecialDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		while (month != -1) {
		if (month < 2) {
			System.out.println("Before");
		}
		else if (month > 2) {
			System.out.println("After");
		}
		else {
			if (day < 18) {
				System.out.println("Before");
			}
			else if (day > 18) {
				System.out.println("After");
			}
			else {
				System.out.println("Special");
			}
		}
		month = sc.nextInt();
		day = sc.nextInt();
		}
	}

}