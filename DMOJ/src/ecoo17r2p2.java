import java.util.*;
import java.io.*;
public class ecoo17r2p2 {
	public static char[][]g;
	public static boolean[][] hV;
	public static int key = 0;
	public static int T = 0;
	public static int n;
	public static int bfs (int stx, int sty) {
	    if (stx >= 0 && sty >= 0 && stx < n && sty < n) {
	    	
	    }
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); g = new char[n][n]; hV = new boolean[n][n];
		int stx, sty;
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < n; j++) {
				g[i][j] = temp.charAt(j);
				if (g[i][j] == '#') hV[i][j] = true;
				if (g[i][j] == 'S') {
					stx = i;sty = j;
				}
			}
		}
	}

}
