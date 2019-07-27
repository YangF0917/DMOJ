import java.util.*;
public class dmopc18c5p0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();double x1 = sc.nextDouble();double y1 = sc.nextDouble();double z1 = sc.nextDouble();double x2 = sc.nextDouble();double y2 = sc.nextDouble();double z2 = sc.nextDouble();
		if (a.equals("Multiply")) System.out.println(x1*x2 + " " + y1*y2 + " " + z1*z2);
		else if (a.equals("Screen")) System.out.println(1-((1-x1)*(1-x2)) + " " + (1-((1-y1)*(1-y2))) + " " + (1-((1-z1)*(1-z2))));
		else {
			double xf, yf, zf;
			if (x1 < 0.5) xf = 2*((x1)*(x2));
			else xf = 1-2*((1-x1)*(1-x2));
			if (y1 < 0.5) yf = 2*((y1)*(y2));
			else yf = 1-2*((1-y1)*(1-y2));
			if (z1 < 0.5) zf = 2*((z1)*(z2));
			else zf = 1-2*((1-z1)*(1-z2));
			System.out.println(xf + " " + yf + " " + zf);
		}
	}

}
