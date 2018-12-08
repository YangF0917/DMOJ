package Finished;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
public class VoronoiVillages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".0");
        int n = sc.nextInt();
        long [] houses = new long[n];
        for (int i = 0; i < n; i++){
            houses[i] = sc.nextInt();
        }
        Arrays.sort(houses);
        double smallest = 10*(houses[n-1] - houses[0]);
        for (int i = 1; i < n-1; i++){
            double ncr = 10.0*((houses[i+1] + houses[i]) / 2.0 - (houses[i] + houses[i-1]) / 2.0);
            if (ncr <= smallest) smallest = (ncr);
        }
        double val = new BigDecimal(Double.toString(smallest/10)).doubleValue();
        System.out.print(df.format(val));
	}
}
