package Finished;
import java.util.*;
public class ppwindsor18p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt(); int h = sc.nextInt();
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}

}
