import java.util.*;
public class dmopc18c5p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		LinkedList<Double> o = new LinkedList<Double>();
		double sum = 0;
		double sumo = 0;
		double [][] pi = new double[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++){
				pi[i][j] = sc.nextDouble();
				sum += pi[i][j];
			}
		}
		sumo = sum;
		if (sum/(r*c) == 0.48) System.out.println("correctly exposed");
		else if (sum/(r*c) > 0.48) {System.out.println("overexposed"); System.out.println(.48*r*c/sum);}
		else {
			System.out.println("underexposed");
			double k = -1;
			int k1 = 0;
			double mult = .48*(r*c)/(sum);
			while ((sumo*mult-k)/ (r*c) != 0.48) {
				sum = 0;
				k = 0;
				k1 = 0;
				o = new LinkedList<Double>();
				for (int i = 0; i < r; i++) {
					for (int j = 0; j < c; j++){
						sum += pi[i][j] * mult;
						if (pi[i][j] * mult > 1) {
							k += pi[i][j]*mult - 1;
							k1++;
							o.add(pi[i][j]);
						}
					}
				}
				double sub = 0;
				for (double i: o) sub += i;
				mult += k*(r*c-k1)/(sumo-sub);
				System.out.println(mult);
			}
			System.out.println(mult);
		}
	}

}
