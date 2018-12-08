package Finished;
import java.util.*;
public class QualityScenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if (c < b && d > a) System.out.println("YES");
		else System.out.println("NO");
	}

}
