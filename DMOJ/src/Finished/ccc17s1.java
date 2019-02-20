package Finished;
import java.util.*;
public class ccc17s1 {
	public static int n;
	public static void prefix(int[] a) {
		for (int i = 1; i < n; i++) a[i] += a[i-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int [] prea = new int [n];
		int [] preb = new int [n];
		for (int i = 0; i < n; i++) prea[i] = sc.nextInt();
		for (int i = 0; i < n; i++) preb[i] = sc.nextInt();
		prefix(prea); prefix(preb);
		int ans = 0;
		for (int i = 0; i < n; i++) if (prea[i] == preb[i]) ans=i+1;
		System.out.println(ans);
	}

}

