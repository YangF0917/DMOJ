package Finished;
import java.util.*;
public class ccc07s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] boxes = new int[3][n];
		for (int i = 0; i < n; i++) {
			boxes[0][i] = sc.nextInt();
			boxes[1][i] = sc.nextInt();
			boxes[2][i] = sc.nextInt();
			for(int j = 0; j < 2; j++) {
				if (boxes[j][i] > boxes[j + 1][i]) {
					int temp = boxes[j][i];
					boxes[j][i] = boxes[j + 1][i];
					boxes[j+1][i] = temp;
				}
			}
			if (boxes[0][i] > boxes[1][i]) {
				int temp = boxes[0][i];
				boxes[0][i] = boxes[1][i];
				boxes[1][i] = temp;
			}
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int area = Integer.MAX_VALUE;
			int[] item = new int[3];
			for (int j = 0; j < 3; j++) {
				item[j] = sc.nextInt();
			}
			Arrays.sort(item);
			for (int j = 0; j < n; j++) {
				int temp = boxes[0][j] * boxes[1][j] * boxes[2][j];
				boolean canFit = true;
				for (int k = 0; k < 3; k++) {
					if (item[k] > boxes[k][j]) canFit = false;
				}
				if (canFit && temp < area) area = temp;
			}
			if (area != Integer.MAX_VALUE) System.out.println(area);
			else System.out.println("Item does not fit.");
		}
	}

}
