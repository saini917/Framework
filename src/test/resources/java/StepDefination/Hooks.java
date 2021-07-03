package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforeMoibleHook()
	{
		System.out.println("Before Mobile Hook");
	}
	
	@After("@MobileTest")
	public void afterMobileHook()
	{
		System.out.println("After Mobile Hook");
	}
	
	
	@Before("@WebTest")
	public void beforeWebHook()
	{
		System.out.println("Before Web Hook");
	}
	
	@After("@WebTest")
	public void afterWebHook()
	{
		System.out.println("After Web Hook");
	}

}
