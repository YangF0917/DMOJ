package Finished;
import java.util.Scanner;
public class HappyOrSad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int happy = 0;
		int sad = 0;
		String user = sc.nextLine();
		String temp = user;
		
		while (temp.indexOf(":-)") != -1) {
			temp = temp.substring(temp.indexOf(":-)") + 1);
			happy++;
		}
		temp = user;
		while (temp.indexOf(":-(") != -1) {
			temp = temp.substring(temp.indexOf(":-(") + 1);
			sad++;
		}
		if (sad == 0 && happy == 0) System.out.println("none");
		else if (happy == sad) System.out.println("unsure");
		else if (happy > sad) System.out.println("happy");
		else System.out.println("sad");
	}
}
