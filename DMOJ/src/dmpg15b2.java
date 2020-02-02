import java.util.*;
public class dmpg15b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] bridge = new int[3];
		int [] box = new int[3];
		
		for (int i = 0; i < 3; i++) {
			bridge[i] = sc.nextInt();
		}
		for (int j = 0; j < 3; j++) {
			box[j] = sc.nextInt();
		}
		Arrays.sort(bridge); Arrays.sort(box);
		boolean fit = true;
		for (int i = 0; i < 3; i++) {
			if (box[i] > bridge[i]) {
				fit = false;
			}
		}
		if (fit) System.out.println("Y");
		else System.out.println("N");
	}

}
