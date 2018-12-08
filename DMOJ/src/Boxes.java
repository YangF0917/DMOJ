import java.util.*;
public class Boxes {

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
		
		// Tests
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(boxes[j][i] + " ");
			}
			System.out.println("");
		}
	}

}
