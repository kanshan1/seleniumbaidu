package dlx;

import org.junit.Test;
import org.testng.annotations.Parameters;

public class add {
	@Test
	@Parameters({"a","b"})
	public void p(String a,String b){
		System.out.println(a);
		System.out.println(b);
	}
}
