package Finished;
import java.util.*;
public class ListMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int []user = new int [n];
		for (int i = 0;i < n; i++) user[i] = sc.nextInt();
		Arrays.sort(user);
		for (int i = 0; i <n; i++) {
			System.out.println(user[i]);
		}
	}

}
