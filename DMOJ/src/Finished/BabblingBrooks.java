package Finished;
import java.util.*;
import java.io.*;
public class BabblingBrooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> streamVal = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			streamVal.add(sc.nextInt());
		}
		int com = sc.nextInt();
		while (com != 77) {
			if (com == 99) {
				int splitStream = sc.nextInt();
				splitStream -=1;
				int leftP = sc.nextInt();
				int leftVal = (int)(leftP/100.0*streamVal.get(splitStream));
				streamVal.add(splitStream, leftVal);
				streamVal.set(splitStream+1, streamVal.get(splitStream+1) - leftVal);
				com = sc.nextInt();
			}
			else if (com == 88) {
				int join = sc.nextInt();
				join -= 1; 
				int a = streamVal.remove(join);
				streamVal.set(join, streamVal.get(join) + a);
				com = sc.nextInt();
			}
		}
		System.out.print(streamVal.get(0));
		for (int i = 1; i < streamVal.size(); i++) {
			System.out.print(" " + streamVal.get(i));
		}
	}
}
