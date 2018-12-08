package Finished;
import java.util.*;
public class Sunflowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        boolean isSorted = true;
        int[][] flowers = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                flowers[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (!(flowers[i][j] > flowers[i-1][j] && flowers[i][j] > flowers[i][j-1])) isSorted = false;
            }
        }
        if (isSorted) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(flowers[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            // Right 90
            isSorted = true;
            for (int i = n-2; i >= 0 ; i--) {
                for (int j = 1; j < n; j++) {
                    if (!(flowers[j][i] > flowers[j-1][i] && flowers[j][i] > flowers[j][i+1])) isSorted = false;
                }
            }
                if (isSorted){
                    for (int i = n-1; i >= 0; i--) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(flowers[j][i] + " ");
                        }
                        System.out.println();
                    }
                }
                else{
                    isSorted = true;
                    for (int i = n-2; i >= 0 ; i--) {
                        for (int j = 1; j < n; j++) {
                            if (!(flowers[i][j] > flowers[i][j-1] && flowers[i][j] > flowers[i+1][j])) isSorted = false;
                        }
                    }
                    if (isSorted){
                        for (int i = 0; i < n; i++){
                            for (int j = n-1; j >= 0; j--){
                                System.out.print(flowers[j][i] + " ");
                            }
                            System.out.println();
                        }
                    }
                    else{
                        for (int i = n-1; i >= 0; i--){
                            for (int j = n-1; j>= 0; j--){
                                System.out.print(flowers[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                }
            }
	}

}
