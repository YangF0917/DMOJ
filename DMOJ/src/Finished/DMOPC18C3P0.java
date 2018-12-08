package Finished;
import java.util.*;
public class DMOPC18C3P0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt(); int g1 = sc.nextInt(); int b1 = sc.nextInt();
		int r2 = sc.nextInt(); int g2 = sc.nextInt(); int b2 = sc.nextInt();
		double c1 = Math.floor(Math.sqrt(r1));
		double c2 = Math.floor(Math.sqrt(g1));
		double c3 = Math.floor(Math.sqrt(b1));
		double c4 = Math.floor(Math.sqrt(r2));
		double c5 = Math.floor(Math.sqrt(g2));
		double c6 = Math.floor(Math.sqrt(b2));
		if (c1 == c4 && c2 == c5 && c3 == c6) {System.out.println("Dull");}
		else {System.out.println("Colourful");}
	}

}
