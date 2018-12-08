package Finished;
import java.util.*;
public class SoundsFishy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] fish = new int [4];
		for (int i = 0; i < 4; i++) {
			fish[i] = sc.nextInt();
		}
		if (fish[0] < fish[1] && fish[1] < fish[2] && fish[2] < fish[3]) System.out.println("Fish Rising");
		else if (fish[0] == fish[1] && fish[1] == fish[2] && fish[2] == fish[3]) System.out.println("Fish At Constant Depth");
		else if (fish[0] > fish[1] && fish[1] > fish[2] && fish[2] > fish[3]) System.out.println("Fish Diving");
		else System.out.println("No Fish");
	
	
	}
}
