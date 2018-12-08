package Finished;
import java.util.*;

public class WhatIsNDaddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int ncounter = 0;
		for (int i = 0; i <= n / 2; i++) {
			if (i <= 5 && n - i >= 0 && n - i <= 5) {
				ncounter++;
			}
		}
		System.out.println(ncounter);
	}

}
