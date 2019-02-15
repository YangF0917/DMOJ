import java.util.*;
public class TheCellSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		a -= 100;
		if (a < 0) a = 0;
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double aPrice = a * 0.25 + b * 0.15 + c * 0.2;
		System.out.printf("Plan A costs %,.2f", aPrice);
		System.out.println();
		a -= 150;
		if (a < 0) a = 0;
		double bPrice = a * 0.45 + b * 0.35 + c * 0.25;
		System.out.printf("Plan B costs %,.2f" , bPrice);
		System.out.println();
		if (aPrice < bPrice) System.out.println("Plan A is cheapest.");
		else if (aPrice > bPrice) System.out.println("Plan B is cheapest.");
		else System.out.println("Plan A and B are the same price.");
	}

}
