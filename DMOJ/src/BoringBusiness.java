import java.util.*;
import java.io.*;
public class BoringBusiness {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean [][] hole = new boolean[401][200];
		hole[200][4] = true;
		hole[200][5] = true;
		hole[200][6] = true;
		hole[201][0] = true;
		hole[201][1] = true;
		hole[201][2] = true;
		hole[201][6] = true;
		hole[202][2] = true;
		hole[202][6] = true;
		hole[203][2] = true;
		hole[203][6] = true;
		hole[204][2] = true;
		hole[204][3] = true;
		hole[204][4] = true;
		hole[204][6] = true;
		hole[205][4] = true;
		hole[205][6] = true;
		hole[206][2] = true;
		hole[206][3] = true;
		hole[206][4] = true;
		hole[206][6] = true;
		hole[207][2] = true;
		hole[207][6] = true;
		hole[208][2] = true;
		hole[208][3] = true;
		hole[208][4] = true;
		hole[208][5] = true;
		hole[208][6] = true;
		int xPos = 200;
		int yPos = 4;
		boolean isSafe = true;
		String user = "";
		while (!user.equals("q") && isSafe) {
			user = sc.nextLine();
			int tiles = sc.nextInt();
			if (user.equals("u")) {
				for (int i = 1; i <= tiles; i++) {
					if (!hole[xPos][yPos-i]) {
						hole[xPos][yPos-i] = true;
					}
					else {
						isSafe = false;
					}
				}
				yPos -= tiles;
				System.out.print(xPos-201 + " " + (-yPos - 1) + " ");
				if (isSafe) System.out.println("safe");
				else System.out.println("DANGER");
			}
			else if(user.equals("d")) {
				for (int i = 1; i <= tiles; i++) {
					if (!hole[xPos][yPos+i]) {
						hole[xPos][yPos+i] = true;
					}
					else {
						isSafe = false;
					}
				}
				yPos += tiles;
				System.out.print(xPos-201 + " " + (-yPos - 1) + " ");
				if (isSafe) System.out.println("safe");
				else System.out.println("DANGER");
			}
			else if(user.equals("r")) {
				xPos += tiles;
			}
			else if (user.equals("l")) {
				xPos -= tiles;
			}
		}
	}

}
