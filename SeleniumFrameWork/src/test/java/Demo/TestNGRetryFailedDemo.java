package Demo;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	
	
	@Test
	public void test1()
	{
		
		System.out.println("I am inside Test1");
		
	}
	
	
	@Test
	public void test2()
	{
		
		System.out.println("I am inside Test2");
	   
	}	
	

	@Test(retryAnalyzer=listeners.RetryAnalyzer.class)
	public void test3()
	{
		
		System.out.println("I am inside Test3");
		Assert.assertTrue(0>1);
		
	}	
	

	@Test
	public void test4()
	{
		
		System.out.println("I am inside Test4");
		
	}	



}
