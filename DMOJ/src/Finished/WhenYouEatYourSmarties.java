package Finished;
import java.util.*;
public class WhenYouEatYourSmarties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int org = 0;
		int blue = 0;
		int green = 0;
		int yel = 0;
		int pink = 0;
		int vio = 0;
		int bro = 0;
		int red = 0;
		String smarties = "";
		while (!smarties.equals("end of box")) {
			smarties = sc.nextLine();
			if (smarties.equals("red")) {
				red++;
			}
			else if (smarties.equals("orange")){
				org++;
			}
			else if (smarties.equals("blue")){
				blue++;
			}
			else if (smarties.equals("green")){
				green++;
			}
			else if (smarties.equals("yellow")){
				yel++;
			}
			else if (smarties.equals("pink")){
				pink++;
			}
			else if (smarties.equals("violet")){
				vio++;
			}
			else if (smarties.equals("brown")){
				bro++;
			}
		}
		int time = 0;
		if (org % 7 == 0) {
			time += org / 7 * 13;
		}
		else {
		    time += (org / 7) * 13 + 13;
		}
		if (blue % 7 == 0) {
			time += blue / 7 * 13;
		}
		else {
			time += (blue / 7) * 13 + 13;
		}
		if (green % 7 == 0) {
			time += green / 7 * 13;
		}
		else {
			time += (green / 7) * 13 + 13;
		}
		if (yel % 7 == 0) {
			time += yel / 7 * 13;
		}
		else {
		time += (yel / 7 + 1) * 13;
		}
		if (pink % 7 == 0) {
			time += pink / 7 * 13;
		}
		else {
		time += (pink / 7 + 1) * 13;
		}
		if (vio % 7 == 0) {
			time += vio / 7 * 13;
		}
		else {
		time += (vio / 7 + 1) * 13;
		}
		if (bro % 7 == 0) {
			time += bro / 7 * 13;
		}
		else {
		time += (bro / 7 + 1) * 13;
		}
		time += red * 16;
		System.out.println(time);
	}

}
