import java.io.*;
import java.util.*;
public class Test2 {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*
		for (int i = 0; i <= 101; i++) {
		FileReader fr = new FileReader("C:\\Users\\Felix\\Desktop\\TestCases\\P3_Felixs_Coin_Collection\\input\\input"+ i +".txt");
		BufferedReader br = new  BufferedReader(fr);
		FileReader ar = new FileReader("C:\\Users\\Felix\\Desktop\\TestCases\\P3_Felixs_Coin_Collection\\output\\output"+ i +".txt");
		BufferedReader abr = new BufferedReader(ar);
		int a = Integer.parseInt(br.readLine());
		long ans = Long.parseLong(abr.readLine());
		*/
		int a = sc.nextInt();
		long count = 0l;
		for (int d = 0; d <= a / 10; d++) {
			for (int q = 0; q <= a / 25; q++) {
				for (int l = 0; l <= a / 100; l++) {
					for (int t = 0; t <= a / 200; t++) {
						if (10*d + 25*q + 100*l + 200*t == a) count++;
					}
				}
			}
		}
		System.out.println(count);
		/*
		if (count == ans) {
			System.out.println("Test " + i + " Success");
		}
		else System.out.println("Test "+ i + " Failed");
		}
		*/
	}

}
