package Finished;
import java.util.*;
public class Balance {
	public static void main (String [] args) {
	Scanner sc = new Scanner (System.in);
	String userIn = sc.nextLine();
	Stack <String> brackets	= new Stack <String>();
	for (int i = 0; i < userIn.length(); i++) {
		if (userIn.charAt(i) == ')') {
			if (brackets.size() != 0) {
			if (brackets.peek() == "(") {
				brackets.pop();
			}
			else {
				brackets.push(")");
			}
			}
			else {
				brackets.push(")");
			}
		}
		else {
			brackets.push("(");
		}
	}
	if (brackets.size() <= 2) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
	}
}
