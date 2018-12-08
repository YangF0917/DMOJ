package Finished;
import java.util.*;
public class TimeOnTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int [] chores = new int[d];
		for (int i = 0; i < d; i++) {
			chores[i] = sc.nextInt();
		}
		Arrays.sort(chores);
		int sum = 0;
		int index = 0;
		while (sum + chores[index] <= n) {
			sum += chores[index];
			index++;
		}
		System.out.println(index);
	}

}
