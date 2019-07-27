import java.util.*;
import java.io.*;
public class Main {
	public static int []diffx, diffy;
	public static void gridx(int [][] grid) {
		for (int i = 0; i < 3; i++) {
			int xCount = 0;
			for (int j = 0; j < 3; j++) {
				if (grid[i][j] == Integer.MIN_VALUE) xCount++;
			}
			if (xCount == 1) {
				if (grid[i][0] == Integer.MIN_VALUE) {
					diffx[i] = grid[i][2]-grid[i][1];
					grid[i][0] = grid[i][1] - diffx[i];
				}
				else if (grid[i][1] == Integer.MIN_VALUE) {
					diffx[i] = (grid[i][2]-grid[i][0])/2;
					grid[i][1] = grid[i][2] - diffx[i];
				}
				else {
					diffx[i] = grid[i][1]-grid[i][0];
					grid[i][2] = grid[i][1] + diffx[i];
				}
			}
			if (xCount == 0) diffx[i] = grid[i][1] - grid[i][0];
		}
	}
	public static void gridy(int [][]grid) {
		for (int i = 0; i < 3; i++) {
			int xCount = 0;
			for (int j = 0; j < 3; j++) {
				if (grid[j][i] == Integer.MIN_VALUE) xCount++;
			}
			if (xCount == 1) {
				if (grid[0][i] == Integer.MIN_VALUE) {
					diffy[i] = grid[2][i]-grid[1][i];
					grid[0][i] = grid[1][i] - diffy[i];
				}
				else if (grid[1][i] == Integer.MIN_VALUE) {
					diffy[i] = (grid[2][i]-grid[0][i])/2;
					grid[1][i] = grid[2][i] - diffy[i];
				}
				else {
					diffy[i] = grid[1][i]-grid[0][i];
					grid[2][i] = grid[1][i] + diffy[i];
				}
			}
			if (xCount == 0) diffy[i] = grid[1][i] - grid[0][i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] grid = new int[3][3];
		diffx = new int[3];
		diffy = new int[3];
		for (int i = 0; i < 3; i++) {
			diffx[i] = Integer.MIN_VALUE;
			diffy[i] = Integer.MIN_VALUE;
		}
		int diff = Integer.MIN_VALUE;
		for (int i = 0; i < 3; i++){
			String []temp = sc.nextLine().split(" ");
			for (int j = 0; j < 3; j++) {
				if (!temp[j].equals("X")) grid[i][j] = Integer.parseInt(temp[j]);
				else grid[i][j] = Integer.MIN_VALUE;
			}
		}
		gridx(grid); gridy(grid);gridx(grid); gridy(grid);
		int hasDiff = 0; boolean xE = false;
		for (int i = 0; i < 3; i++) {
			if (diffx[i] != Integer.MIN_VALUE) hasDiff++;
		}
		if (hasDiff >= 2) {
			if (diffx[0] != Integer.MIN_VALUE && diffx[1] != Integer.MIN_VALUE) {
				diff = diffx[1] - diffx[0];
			}
			else if (diffx[2] != Integer.MIN_VALUE && diffx[1] != Integer.MIN_VALUE) {
				diff = diffx[2] - diffx[1];
			}
			else {
				diff = diffx[2] - (diffx[0] + diffx[2])/2; 
			}
		}
		if (hasDiff == 0) xE = true;
		hasDiff = 0; boolean yE = false;
		for (int i = 0; i < 3; i++) {
			if (diffy[i] != Integer.MIN_VALUE) hasDiff++;
		}
		if (hasDiff >= 2) {
			if (diffy[0] != Integer.MIN_VALUE && diffy[1] != Integer.MIN_VALUE) {
				diff = diffy[1] - diffy[0];
			}
			else if (diffy[2] != Integer.MIN_VALUE && diffy[1] != Integer.MIN_VALUE) {
				diff = diffy[2] - diffy[1];
			}
			else {
				diff = diffy[2]-(diffy[0] + diffy[2])/2; 
			}
		}
		if (hasDiff == 0) yE = true;
		if (diff == Integer.MIN_VALUE) diff = 0;
		if (xE) diffx[0] = 0;
		if (yE) diffy[0] = 0;
		if (diffx[0] != Integer.MIN_VALUE) {
			diffx[1] = diffx[0] + diff; diffx[2] = diffx[0] + 2*diff;
		}
		else if (diffx[1] != Integer.MIN_VALUE) {
			diffx[0] = diffx[1] - diff; diffx[2] = diffx[1] + diff;
		}
		else {
			diffx[0] = diffx[2] - 2*diff; diffx[1] = diffx[2] - diff;
		}
		if (diffy[0] != Integer.MIN_VALUE) {
			diffy[1] = diffy[0] + diff; diffy[2] = diffy[0] + 2*diff;
		}
		else if (diffy[1] != Integer.MIN_VALUE) {
			diffy[0] = diffy[1] - diff; diffy[2] = diffy[1] + diff;
		}
		else {
			diffy[0] = diffy[2] - 2*diff; diffy[1] = diffy[2] - diff;
		}
		if (diff != 0 && diffx[0] != 0) {
		for (int i = 0; i < 3; i++) {
			if (grid[i][0] != Integer.MIN_VALUE) {
				grid[i][1] = grid[i][0] + diffx[i];
				grid[i][2] = grid[i][1] + diffx[i];
			}
			else if (grid[i][1] != Integer.MIN_VALUE) {
				grid[i][0] = grid[i][1] - diffx[i];
				grid[i][2] = grid[i][1] + diffx[i];
			}
			else if (grid[i][2] != Integer.MIN_VALUE) {
				grid[i][1] = grid[i][2] - diffx[i];
				grid[i][0] = grid[i][1] - diffx[i];
			}
		}
		}
		for (int i = 0; i < 3; i++) {
			if (grid[0][i] != Integer.MIN_VALUE) {
				grid[1][i] = grid[0][i] + diffy[i];
				grid[2][i] = grid[1][i] + diffy[i];
			}
			else if (grid[1][i] != Integer.MIN_VALUE) {
				grid[0][i] = grid[1][i] - diffy[i];
				grid[2][i] = grid[1][i] + diffy[i];
			}
			else if (grid[2][i] != Integer.MIN_VALUE) {
				grid[1][i] = grid[2][i] - diffy[i];
				grid[0][i] = grid[1][i] - diffy[i];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}
