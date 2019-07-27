import java.util.*;
import java.io.*;
import java.time.*;
public class Main2 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		for (int z = 2; z < 100; z++) {
		FileWriter fw = new FileWriter("input" + z + ".txt");
		PrintWriter pw = new PrintWriter(fw);
		int w = r.nextInt(100) + 1; int h = r.nextInt(100) + 1;
		pw.println(w + " " + r);
		String [] line = {"",""};
		for (int i = 0; i < w; i++) {
			if (i%2 == 0) {
				line[0] += "0"; line[1] += "1";
			} else {
				line[0] += "1"; line[1] += "0";
			}
		}
		FileWriter f = new FileWriter("output" + z + ".txt");
		PrintWriter p = new PrintWriter(fw);
		for (int j = 0; j < h; j++) {
			p.println(line[j%2]);
			System.out.println(line[j%2]);
		}
		}
	}

}
