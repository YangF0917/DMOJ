package Finished;
import java.util.*;
public class OldFishinHole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int options = 0;
		int trout = sc.nextInt();
		int pike = sc.nextInt();
		int pickerel = sc.nextInt();
		int pond = sc.nextInt();
		
		for (int i = 0; i < pond / trout + 1; i++) {
			for (int j = 0; j < pond / pike + 1; j++) {
				for (int k = 0; k < pond / pickerel + 1; k++) {
					if (i + k + j != 0) {
						if (trout * i + pike * j + pickerel * k <= pond) {
							System.out.println(i + " Brown Trout, " + j + " Northern Pike, "+ k + " Yellow Pickerel");
							options++;
						}
					}
				}
			}
		}
		System.out.println("Number of ways to catch fish: " + options);
	}

}
