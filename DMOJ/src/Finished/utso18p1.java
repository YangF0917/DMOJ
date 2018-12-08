package Finished;
import java.util.*;
public class utso18p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long a = sc.nextLong(); long b = sc.nextLong();
		long sum = a + b;
		long difference;
		if (a > b) {
			difference = a - b;
		}
		else {
			difference = b - a;
		}
		long product = a * b;
		ArrayList<Long> gg = new ArrayList<Long>();
		gg.add(sum); gg.add(difference); gg.add(product);
		gg.sort(null);
		
		System.out.println(gg.get(2));
	}

}
