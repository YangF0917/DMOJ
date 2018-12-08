import java.util.*;
public class Sectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int s = sc.nextInt();
		long k = sc.nextLong();
		long counter = 0;
		String rooms = "";
		String temp = sc.nextLine();
		for (int i = 0; i < s; i++) {
			rooms += sc.nextLine();
		}
		String order = "";
		for (int i = 0; i < k; i++){
			order += sc.nextLine();
		}
		
		int travTot = 0;
		for (int i = 1; i < order.length(); i++){
				counter += Math.abs(rooms.indexOf(order.charAt(i)) - rooms.indexOf(order.charAt(i-1)));
		}
		
		System.out.println(counter+1);
		}
	}
