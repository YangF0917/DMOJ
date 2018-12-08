package Finished;
import java.util.*;
public class CanadianCalorieCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int calories = 0;
		int [] burger = {461, 431, 420, 0};int [] drink = {130, 160, 118, 0};int [] side = {100, 57, 70, 0};int [] dessert = {167, 266, 75, 0};
		calories += burger[sc.nextInt()-1] += side[sc.nextInt()-1]+= drink[sc.nextInt()-1];calories += dessert[sc.nextInt()-1];
		System.out.println("Your total Calorie count is "+ calories + ".");
	}

}
