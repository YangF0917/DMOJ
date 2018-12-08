package Finished;
import java.util.*;
public class TrainSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int size = sc.nextInt();
			int [] trains = new int[size];
			for (int j = 0; j < size; j++) {
				trains[j] = sc.nextInt();
			}
			System.out.println("Optimal train swapping takes " + bubbleSort(trains) + " swap(s).");
		}
				
	}
	public static int bubbleSort(int [] arr) {
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;
					count++;
				}
			}
		}
		return count;
	}

}
