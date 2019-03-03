package Finished;
import java.util.*;
public class coci07c5p3 {
	public static double ar(int xA, int xB, int xC, int yA, int yB, int yC) {
		return Math.abs(xA*(yB-yC)+xB*(yC-yA)+xC*(yA-yB))/2.0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] p = new int[3][2];
		for (int i = 0; i < 3; i++) {
			p[i][0] = sc.nextInt(); p[i][1] = sc.nextInt();
		}
		int c = 0;
		double aO = ar(p[0][0], p[1][0], p[2][0], p[0][1], p[1][1], p[2][1]);
		System.out.printf("%.1f\n", aO);
		int a = sc.nextInt();
		int [][] co = new int[a][2];
		for (int i = 0; i < a; i++) {
			int x1 = sc.nextInt(); int y1 = sc.nextInt();
			if (aO >= ar(p[0][0], p[1][0], x1, p[0][1], p[1][1], y1) + ar(p[0][0], p[2][0], x1, p[0][1], p[2][1], y1) + ar(p[2][0], p[1][0], x1, p[2][1], p[1][1], y1)) c++;
		}
		System.out.println(c);
	}

}
