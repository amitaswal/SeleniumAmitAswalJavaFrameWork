package Demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNGParameterDemo {
	
	@Test
	//@Parameters({"MyName","ABC"})
	@Parameters({"MyName"})
	
	public void test1(@Optional("Amit Aswal") String name) 
	{
		System.out.println("My name is :"+name);
		
	}
	
	public void test2() 
	{
		
		
	}

	
	public void test3() 
	{
		
		
	}
}
