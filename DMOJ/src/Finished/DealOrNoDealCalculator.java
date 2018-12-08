package Finished;
import java.util.Scanner;
public class DealOrNoDealCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 1691600;
		int [] cases = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
		for (int i = 0; i < n; i++) {
			sum -= cases[sc.nextInt()-1];
		}
		int offer = sc.nextInt();
		if (sum / (10-n) > offer) System.out.println("no deal");
		else System.out.println("deal");
	}

}
