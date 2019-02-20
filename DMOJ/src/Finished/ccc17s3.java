package Finished;
import java.util.*;
import java.io.*;
public class ccc17s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] b = new int[4001];
		int [] sum = new int [4001];
		for (int i = 0; i < a; i++) {
			int temp = sc.nextInt();
			b[temp] += 1;
		}
		for (int i = 2; i < 4001; i++) {
			for (int j = 1; j <= i/2; j++) {
				if (j != i-j) sum[i] += Math.min(b[j], b[i-j]);
				else sum[i] += b[j]/2;
			}
		}
		int max = 0; int c = 1;
		for (int i = 0; i < 4001; i++) {
			if (sum[i] > max) {
				c=1;
				max = sum[i];
			}
			else if (sum[i] == max) c++;
		}
		System.out.println(max + " " + c);
	}

}
