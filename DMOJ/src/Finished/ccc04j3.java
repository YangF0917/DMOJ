package Finished;
import java.util.*;
public class ccc04j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); int b = sc.nextInt();
		String [] adj = new String[a]; String [] n = new String[b]; sc.nextLine();
		for (int i = 0; i < a; i++) adj[i] = sc.nextLine();
		for (int i = 0; i < b; i++) n[i] = sc.nextLine();
		for (int i = 0; i < a; i++) for(int j = 0; j < b; j++) System.out.println(adj[i] + " as " + n[j]);
	}

}
