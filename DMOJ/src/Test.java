import java.util.*;
import java.io.*;
import java.time.*;
public class Test {
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int j = 0; j < 102; j++) {
        	FileWriter fw = new FileWriter("input"+j+".txt");
    		PrintWriter pw = new PrintWriter(fw);
    		int total = 0;
        	long s = r.nextInt(1000001);
        	for (int i = 0; i < 10; i++) {
        		if (s%5 != 0) s = r.nextInt(1000001);
        	}
        	pw.println(s);
        	System.out.println(s);
        	pw.close();
        	FileWriter f = new FileWriter("output"+j+".txt");
        	PrintWriter p = new PrintWriter(f);
        	long ans = 0;
        	if (s % 10 == 5) {
        		s -= 25;
        		long d = s/10; long q = 0;
        		while (d >= 0) {
        			for (long i = q; i >= 0; i -= 4) {
        				ans += i/8 + 1;
        			}
        			d -= 5; q += 2;
        		}
        		p.println(ans);
        		System.out.println(ans);
        	}
        	else if (s % 10 == 0) {
        		long d = s/10; long q = 0;
        		while (d >= 0) {
        			for (long i = q; i >= 0; i -= 4) {
        				ans += i/8 + 1;
        			}
        			d -= 5; q += 2;
        		}
        		p.println(ans);
        		System.out.println(ans);
        	}
        	else {
        		p.println(0);
        		System.out.println(0);
        	}
        	p.close();
        }
    }
}

