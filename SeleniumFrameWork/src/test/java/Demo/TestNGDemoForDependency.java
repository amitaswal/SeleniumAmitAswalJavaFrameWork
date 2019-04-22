package Demo;

import org.testng.annotations.Test;

public class TestNGDemoForDependency 
{
	//@Test(dependsOnMethods= {"test2"},priority=1)
	//@Test(dependsOnMethods= {"test2","test3"})
	
	@Test(dependsOnMethods= {"sanity1"})
	public void test1() 
	{

		System.out.println("I am inside Test 1");
	}

	//@Test(priority=2)
	//@Test()
	
	@Test(groups= {"sanity1"})
	public void test2() 
	{

		System.out.println("I am inside Test 2");
	}
	

	//@Test(priority=2)
	
	public void test3() 
	{

		System.out.println("I am inside Test 3");
	}
	
	@Test
	public void sanity1()
	
	{
		
		System.out.println("Sanity Test");	
		
	}
}
