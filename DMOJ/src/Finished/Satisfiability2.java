package Finished;
import java.util.Scanner;
import java.text.*;
public class Satisfiability2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double b = sc.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.print("$" + df.format((b / 2)) + " $" + df.format((b - b / 2 + 0.004)));
	}

}
