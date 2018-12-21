package Finished;
import java.util.*;
public class pwindsor18p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 String user = sc.nextLine();
		 int ind = -1;
		 for (int i = 0; i < user.length()-3; i++) {
			 if (user.substring(i, i + 4).equals("java") && ind == -1) {
				 ind = i;
			 }
		 }
		 if (ind == -1) {
			 System.out.println(user.length());
		 }
		 else {
			 System.out.println(ind);
		 }
	}
}
