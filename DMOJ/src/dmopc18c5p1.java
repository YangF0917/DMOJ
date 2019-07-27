import java.util.*;
public class dmopc18c5p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = Integer.toBinaryString(sc.nextInt());
		String b = Integer.toBinaryString(sc.nextInt());
		int k = sc.nextInt();
		int bl = 0; int p = 0;
		for (int i = 0; i < k; i++) {
			if (a.length()-1-i < 0 && b.length()-1-i < 0) p++;
			else if (a.length()-1-i < 0) if (b.charAt(b.length()-1-i) == '1') bl++; else p++;
			else if (b.length()-1-i < 0) if (a.charAt(a.length()-1-i) == '1') bl++; else p++;
			else {
				if (b.charAt(b.length()-1-i) == '1' && a.charAt(a.length()-1-i) == '1') p++;
				else if (a.charAt(a.length()-1-i) == '1') bl++;
				else if (b.charAt(b.length()-1-i) == '1') bl++;
				else p++;
			}
		}
		System.out.println(bl + " " + p);
	}

}