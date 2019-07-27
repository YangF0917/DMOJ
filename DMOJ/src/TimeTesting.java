import java.util.*;
import java.util.concurrent.TimeUnit;
import java.time.*;
public class TimeTesting {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Instant st = Instant.now();
		
		TimeUnit.SECONDS.sleep(5);
		
		Instant en = Instant.now();
		Duration in = Duration.between(st, en);
		System.out.println(in.getSeconds());
		
	}

}
