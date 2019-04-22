package Demo;

public class ExceptionHandlingDemo
{
	public static void main(String[] args)
	{
   
		demo();
	
	}
	
	public static void demo() 
	{
		
		
		try 
		{
			System.out.println("Hello World!!!!");	
			int i=1/0;
			System.out.println("Completed!!!!");	
		}
		catch(Exception exp) 
		{
			System.out.println("I am inside catch Block!!!");
			System.out.println("Message is :"+exp.getMessage());
			System.out.println("Cause is :"+exp.getCause());
			exp.printStackTrace();
			
		}
		
		finally
		{
			
			System.out.println("I am inside finally block!!!");
			
		}
			
		
	}
	

}
