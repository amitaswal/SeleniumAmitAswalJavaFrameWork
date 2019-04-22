package Demo;

import org.testng.annotations.Test;
@Test(groups= {"AllClassTests"})
public class TestNGGroupsDemo
{
@Test(groups= {"Sanity"})
	public void test1() 
{
System.out.println("This is Test1");
}
//@Test(groups= {"Sanity","Smoke"})
@Test(groups= {"windows.Regression"})
public void test2() 
{
System.out.println("This is Test2");
}
//@Test(groups= {"Sanity","Regression"})
@Test(groups= {"linux.Regression"})
public void test3() 
{
System.out.println("This is Test3");
}
	
@Test
public void test4() 
{
System.out.println("This is Test4");
}
	
	
}
