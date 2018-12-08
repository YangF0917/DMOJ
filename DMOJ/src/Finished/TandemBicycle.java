package Finished;

import java.util.Scanner;
public class TandemBicycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		// Tandem Bicycles
		int qNum = sc.nextInt();
		int n = sc.nextInt();
		int []dmoj = new int[n];
		int []peg = new int[n];
		
		for (int i = 0; i < n; i++) dmoj[i] = sc.nextInt();
		for (int i = 0; i < n; i++) peg[i] = sc.nextInt();
		 int total = 0;
		bubbleSort(dmoj);
		bubbleSort(peg);
		if (qNum == 1) {
			for (int i = 0; i < n; i++) {
				if (dmoj[i] < peg[i]) total += peg[i];
				else total += dmoj[i];
			}
			System.out.println(total);
		}
		else {
			for (int i = 0; i < n; i++) {
				if (dmoj[i] > peg[n-1-i]) total += dmoj[i];
				else total += peg[n-i-1];
			}
			System.out.println(total);
		}
	}
	public static void bubbleSort(int [] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;
				}
			}
		}
	}
}

