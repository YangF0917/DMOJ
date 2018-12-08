package Finished;
import java.io.*;
public class Maternity {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String p1 = br.readLine();
		String p2 = br.readLine();
		int num = Integer.parseInt(br.readLine());
		String [] poss = new String [num];
		
		for (int x = 0; x < num; x++) {
			int counter = 0;
			String b = br.readLine();
			if (b.charAt(0) == 'A') {
				if (p1.indexOf("A") != -1 || p2.indexOf("A") != -1) counter++;
			}
			else {
				if (p1.indexOf("a") != -1 && p2.indexOf("a") != -1) counter++;
			}
			if (b.charAt(1) == 'B') {
				if (p1.indexOf("B") != -1 || p2.indexOf("B") != -1) counter++;
			}
			else {
				if (p1.indexOf("b") != -1 && p2.indexOf("b") != -1) counter++;
			}
			if (b.charAt(2) == 'C') {
				if (p1.indexOf("C") != -1 || p2.indexOf("C") != -1) counter++;
			}
			else {
				if (p1.indexOf("c") != -1 && p2.indexOf("c") != -1) counter++;
			}
			if (b.charAt(3) == 'D') {
				if (p1.indexOf("D") != -1 || p2.indexOf("D") != -1) counter++;
			}
			else {
				if (p1.indexOf("d") != -1 && p2.indexOf("d") != -1) counter++;
			}
			if (b.charAt(4) == 'E') {
				if (p1.indexOf("E") != -1 || p2.indexOf("E") != -1) counter++;
			}
			else {
				if (p1.indexOf("e") != -1 && p2.indexOf("e") != -1) counter++;
			}
			if (counter == 5) poss[x] = "Possible baby.";
			else poss[x] = "Not their baby!";
		}
		for (int i = 0; i < poss.length; i++) {
			System.out.println(poss[i]);
		}
	}

}
