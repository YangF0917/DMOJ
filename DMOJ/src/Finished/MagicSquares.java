package Finished;
import java.util.Scanner;
public class MagicSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [][] magic = new int[4][4];
		boolean isMagic = true;
		for (int i = 0; i < 4 ; i++) {
			for (int j = 0; j < 4; j++) {
				magic[i][j] = sc.nextInt();
			}
		}
		int everySum = magic[0][0] + magic[0][1] + magic[0][2] + magic[0][3];
		for (int i = 0; i < 4; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += magic[i][j];
			}
			if (sum != everySum) isMagic = false;
		}
		for (int i = 0; i < 4; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += magic[j][i];
			}
			if (sum != everySum) isMagic = false;
		}
		
		if (isMagic) System.out.println("magic");
		else System.out.println("not magic");
	}

}
