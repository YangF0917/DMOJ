package Finished;
import java.util.*;
public class TheGenevaConfection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int curr = 1;
			Stack <Integer> mt = new Stack<Integer>();
			Stack <Integer> b = new Stack<Integer>();
			for (int j = 0; j < k; j++) {
				mt.push(sc.nextInt());
			}
			while (!mt.isEmpty()) {
			if (mt.peek() == curr) {
				mt.pop();
				curr++;
			}
			else{
				while (!mt.isEmpty() && mt.peek() != curr) {
				b.push(mt.pop());
				}
			}
			if (!b.isEmpty()) {
				while (!b.isEmpty() && b.peek() == curr) {
					b.pop(); 
					curr++;
				}
			}
		}
			if (curr == k+1) System.out.println("Y");
			else System.out.println("N");
	}
		}
	}
