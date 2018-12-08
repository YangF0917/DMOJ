package Finished;
import java.util.Scanner;
public class ReturningHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String [] dir = new String[10];
		String [] location = new String[10];
		int index = 1;
		int i2 = 1;
		String str = sc.nextLine();
		dir[0] = str;
		String loc = "HOME";
		location[0] = sc.nextLine();
		while (!loc.equals("SCHOOL")) {
			str = sc.nextLine();
			loc = sc.nextLine();
			dir[i2] = str;
			location[index] = loc;
			index++;
			i2++;
		}
		for (int i = 9; i > 0; i--) {
			if (location[i] != null) {
				if (dir[i].equals("R")) {
				System.out.println("Turn LEFT onto " +location[i-1]+" street.");
			}
			else if (dir[i].equals("L")) {
				System.out.println("Turn RIGHT onto "+location[i-1]+" street.");
			}
		}
		}
		if (dir[0].equals("R")) System.out.println("Turn LEFT into your HOME.");
		else System.out.println("Turn RIGHT into your HOME.");
	}

}

