package Finished;
import java.io.*;
public class ASquareProblem {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String latin = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n = Integer.parseInt(br.readLine());
		latin = latin.substring(0, n);
		int counter = 0;
		boolean isLatin = true;
		String [] grid = new String [n];
		for (int i = 0; i < n; i++) {
			grid[i] = br.readLine();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				String temp = "";
				if (grid[j].indexOf(latin.charAt(i)) != -1) counter++;
				for (int k = 0; k < n; k++) {
					temp += grid[k].charAt(j);
				}
				if (temp.indexOf(latin.charAt(i)) != -1) counter++;
			}
			if (counter != 2*n) isLatin = false; 
			counter = 0;
		}
		if (isLatin) {
			boolean isSorted = false;
			counter = 0;
			for (int i = 0; i < n; i++) {
				if (grid[0].charAt(i) == latin.charAt(i)) counter++;
				if (grid[i].charAt(0) == latin.charAt(i)) counter++;
			}
			if (counter == 2*n) System.out.println("Reduced");
			else System.out.println("Latin");
		}
		else System.out.println("No");
	}

}
