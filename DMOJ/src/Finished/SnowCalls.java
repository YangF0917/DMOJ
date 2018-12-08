package Finished;
import java.util.Scanner;
public class SnowCalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String temp = sc.nextLine();
		String a = "0 1 ABC2 DEF3 GHI4 JKL5 MNO6 PQRS7 TUV8 WXYZ99 9";
		for (int i = 0; i < n; i++) {
			String num = sc.nextLine();
			num = num.replaceAll("-", "");
			for (int j = 0; j < num.length(); j++) {
				num = num.replace(num.charAt(j), a.substring(a.indexOf(num.charAt(j))).charAt(a.substring(a.indexOf(num.charAt(j))).indexOf(" ") -1)); 
			}
			String rep = "";
			for (int j = 0; j < 10; j++) {
				rep+=num.charAt(j);
				if (j == 2 || j == 5) {
					rep+= "-";
				}
			}
			System.out.println(rep);
		}
	}

}
