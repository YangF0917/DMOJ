package Finished;
import java.util.*;
public class ccc07j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> tr = new HashMap();
		tr.put("CU", "see you"); tr.put(":-)", "I'm happy"); tr.put(":-(", "I'm unhappy"); tr.put(";-)","wink");tr.put(":-P","stick out my tongue");tr.put("(~.~)",	"sleepy");tr.put("TA","totally awesome");tr.put("CCC",	"Canadian Computing Competition");tr.put("CUZ",	"because");tr.put("TY",	"thank-you");tr.put("YW",	"you're welcome");tr.put("TTYL",	"talk to you later");
		String in = "";
		while (!in.equals("TTYL")) {
			in = sc.nextLine();
			if (tr.get(in) == null) System.out.println(in);
			else System.out.println(tr.get(in));
		}
	}

}
