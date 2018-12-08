package Finished;
import java.util.*;
public class ZeroThatOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> boss = new Stack<Integer>();
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int a = sc.nextInt();
			if (a != 0) boss.push(a);
			else boss.pop();
		}
		int sum = 0;
		while (!boss.isEmpty()) sum += boss.pop();
		System.out.println(sum);
	}

}
