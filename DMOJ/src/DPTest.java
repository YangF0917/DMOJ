import java.util.*;
public class DPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int [] minCoin = new int[i+1];
		for (int j = 0; j < i+1; i++) {
			minCoin[j] = Integer.MAX_VALUE;
		}
		minCoin[0] = 0;
		for (int m = 0; m < i+1; m++) {
			
		}
/*
		For i = 1 to S
		For j = 0 to N - 1
		   If (Vj<=i AND Min[i-Vj]+1<Min[i])
		Then Min[i]=Min[i-Vj]+1

		Output Min[S]
		*/
	}

}
