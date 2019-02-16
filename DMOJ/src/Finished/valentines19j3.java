package Finished;
import java.util.*;
public class valentines19j3 {

	public static void pre(long [] temp) {
		for (int i = temp.length-2; i>=0; i--) {
			temp[i] += temp[i+1];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> le = new ArrayList<Character>();
		long total = 0l;
		String m = sc.nextLine();
		for (int i = 0; i < m.length();i++) {
			if (m.charAt(i) == 'l' || m.charAt(i) == 'o' || m.charAt(i) == 'v' || m.charAt(i) == 'e') le.add(m.charAt(i));
		}
		long [] es = new long [m.length()];
		long [] os = new long [m.length()];
		long [] vs = new long [m.length()];
		for (int i = 0; i < le.size(); i++) {
			if (le.get(i) == 'o') os[i]++;
			else if (le.get(i) == 'v') vs[i]++;
			else if (le.get(i) == 'e') es[i]++;
		}
		pre(es);
		for (int i = 0; i < le.size(); i++) {
			vs[i] *= es[i];
		}
		pre(vs);
		for (int i = 0; i < le.size(); i++) {
			os[i] *= vs[i];
		}
		pre(os);
		for (int i = 0; i < le.size(); i++) {
			if (le.get(i) == 'l') total += os[i];
		}
		System.out.println(total);
	}

}
