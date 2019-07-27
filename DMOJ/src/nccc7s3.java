import java.util.*;
public class nccc7s3 {

	public static int fact(int n) {
		if (n == 1) return 1;
		else return n*fact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] x = new long [n];
		long [] y = new long [n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextLong(); y[i] = sc.nextLong();
		} 
		int count = fact(n)/(fact(n-3)*fact(3));
		for (int i = 0; i <= n-2; i++) {
			ArrayList<Double> dup = new ArrayList<Double>();
			for (int j = i+1; j < n; j++) {
					if (dup.contains((y[i]-y[j])/(double)(x[i]-x[j]))) {
						count--;
					}
					else dup.add((y[i]-y[j])/(double)(x[i]-x[j]));
			}
		}
		System.out.println(count);
	}

}