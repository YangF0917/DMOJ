import java.util.*;

public class WillsonandTerritory {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int wX = sc.nextInt();
		int wY = sc.nextInt();
		int n = sc.nextInt();
		int maxX = 0;
		int maxY = 0;
		int minX= 0;
		int minY = 0;
		int pointsx = 0, pointsy = 0;
		for (int i = 0; i < n; i++) {
			pointsx = sc.nextInt();
			pointsy = sc.nextInt();
			if (Math.abs(pointsx - wX) + Math.abs(pointsy - wY) > maxX + maxY) {
				maxX = pointsx;
				maxY = pointsy;
			}
		}
		int k = maxX + maxY;
		
	}

}
