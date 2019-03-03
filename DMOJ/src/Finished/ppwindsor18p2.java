package Finished;
import java.util.*;
import java.io.*;
import java.time.*;
public class ppwindsor18p2 {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(); int h = sc.nextInt();
		String [] line = {"",""};
		for (int i = 0; i < w; i++) {
			if (i%2 == 0) {
				line[0] += "0"; line[1] += "1";
			} else {
				line[0] += "1"; line[1] += "0";
			}
		}
		for (int j = 0; j < h; j++) {
			System.out.println(line[j%2]);
		}
	}

}
