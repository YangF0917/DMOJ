package Finished;
import java.io.*;
import java.util.*;
public class ccc05j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
		double p1 = 0.15 * b + 0.2 * c; double p2 = 0.35 * b + 0.25 * c;
		if (a > 250) {
			p1 += (a-100)* 0.25; p2 += (a-250)* 0.45;
		}
		else if (a > 100) p1 += (a-100)* 0.25;
		System.out.print("Plan A costs ");
		System.out.printf("%.2f\n" , p1); 
		System.out.print("Plan B costs ");
		System.out.printf("%.2f\n" , p2);
		if (Math.round(100*p1) < Math.round(100*p2)) System.out.println("Plan A is cheapest.");
		else if (Math.round(100*p1) == Math.round(100*p2)) System.out.println("Plan A and B are the same price.");
		else System.out.println("Plan B is cheapest.");
		
	}

}
