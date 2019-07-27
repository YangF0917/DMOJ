import java.util.*;
public class _3dconnect4 {

	public static int c = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] b = new String [36];
		for (int i = 0; i < 36; i++) {
			b[i] = sc.nextLine();
			for (int j = 0; j < 3; j++) {
				if (b[i].substring(j, j+4).equals("RRRR")) c++;
			}
			if (i % 6 == 5) {
				for (int j = i-5; j < i-2; j++) {
					String temp = "";
					for (int k = 0; k < 6; k++) {
						temp += b[j].charAt(k);
					}
					if (temp.equals("RRRR")) c++;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				
			}
		}
		if (c == 0)	System.out.println("lost");
		else System.out.println(c);
	}

}
