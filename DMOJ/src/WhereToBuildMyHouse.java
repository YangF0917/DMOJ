import java.util.*;


public class WhereToBuildMyHouse {
	public static void merge(ArrayList<Long> b) {
		int counter = 1;
		while (counter + 2 < b.size()) {
			if (b.get(counter) > b.get(counter+1)) {
				b.remove(counter); b.remove(counter);
			}
			else {
				counter += 2;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		long l = sc.nextLong();
		int n = sc.nextInt();
		ArrayList<Long> ends = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			Collections.sort(ends);
			if (ends.isEmpty()) {
				ends.add(a); ends.add(b);
			}
			else {
				boolean isput = false;
				for (int j = 0; j < ends.size(); j+=2) {
					if (a >= ends.get(j) && a <= ends.get(j+1)) {
						if (b > ends.get(j+1)) {
							ends.set(j+1, b);
						}
						isput = true;
						merge(ends);
					}
					else if (b >= ends.get(j) && b <= ends.get(j+1)) {
						if (a < ends.get(j)) {
							ends.set(j, a);
						}
						isput = true;
						merge(ends);
					}
					else if (a < ends.get(j)) {
						if (b > ends.get(j+1)) {
							ends.set(j, a);
							ends.set(j+1, b);
							isput = true;
							merge(ends);
						}
					}
				}
				
				if (!isput) {
					ends.add(a); ends.add(b);
				}
			}
		}
		long max = 0;
		int x = 0;
		while (x + 2 <= ends.size() + 1) {
			if (x == 0) {
				if (ends.get(0) > max) {
					max = ends.get(0);
				}
				x += 2;
			}
			else {
				if (ends.get(x) - ends.get(x-1) > max) {
					max = ends.get(x) - ends.get(x-1);
				}
				x += 2;
			}
		}
		if (l - ends.get(ends.size()-1) > max) {
			max = l - ends.get(ends.size()-1);
		}
		System.out.println(max);
	}

}
