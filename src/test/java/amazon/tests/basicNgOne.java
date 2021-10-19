package amazon.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class basicNgOne {
	
	@BeforeTest
	public void bftest() {
		
		System.out.println("It is beforetest");
	}

	
	@BeforeMethod
	
	public void bfmethod() {
		
		System.out.println("It is beforeMethod");
		
	}


}
