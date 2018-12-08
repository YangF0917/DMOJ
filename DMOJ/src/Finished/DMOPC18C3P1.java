package Finished;
import java.util.*;
public class DMOPC18C3P1 {
	public static int find(String key, String[] tones) {
		for (int i = 0; i < tones.length; i++) {
			if (tones[i].equals(key)) return i;
		}
		return -1;
	}
	public static String triad(int a, int b) {
		if (a == 4 && b == 3) return "major"; 
		else if (a == 3 && b == 4) return "minor";
		else if (a == 4 && b == 4) return "augmented";
		else if (a == 3 && b == 3) return "diminished";
		else return "none";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] tones = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
		// Root position: One of the above
		// First inversion: Shift left 1 to get above
		// Second inversion: Shift left 2 to get above
		// Root is the first tone in the sequence
		String [] toneOrd = new String[3];
		int[] toneVal = new int[3];
		for (int i = 0; i < 3; i ++) {
			toneOrd[i] = sc.nextLine();
			toneVal[i] = find(toneOrd[i], tones);
		}
		int [] toneDiff = new int[3];
		for (int i = 0; i < 2; i++) {
			toneDiff[i] = toneVal[i+1] - toneVal[i];
		}
		toneDiff[2] = toneVal[0] - toneVal[2];
		for (int i = 0; i < 3; i++) {
			if (toneDiff[i] < 0) toneDiff[i] = tones.length + toneDiff[i];
		}
		if (!triad(toneDiff[0], toneDiff[1]).equals("none")) {
			System.out.println(toneOrd[0]);System.out.println(triad(toneDiff[0], toneDiff[1])); System.out.println("root position");
		}
		else if (!triad(toneDiff[0], toneDiff[2]).equals("none")) {
			System.out.println(toneOrd[2]);System.out.println(triad(toneDiff[2], toneDiff[0])); System.out.println("first inversion");
		}
		else { System.out.println(toneOrd[1]);System.out.println(triad(toneDiff[1], toneDiff[2])); System.out.println("second inversion");}
	}

}
