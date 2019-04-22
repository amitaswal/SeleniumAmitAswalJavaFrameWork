package listeners;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo2 

{
	@Test
	public void test6()
	{
		
	System.out.println("I am inside Test6");	
		
	}
	
	@Test
	public void test7()
	{
		
	System.out.println("I am inside Test7");	
		
	}
	@Test
	public void test8()
	{
		
	System.out.println("I am inside Test8");	
		
	}

	@Test
	public void test9()
	{
		
	System.out.println("I am inside Test9");

		
	}

	@Test
	public void test10()
	{
		
	System.out.println("I am inside Test10");
	throw new SkipException("This Test is Skipped!!!");
		
	}
}
