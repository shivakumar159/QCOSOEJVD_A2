package TestNG_Group;

import org.testng.annotations.Test;

public class Sample2_group {
	@Test
	public void demo3()
	{
		System.out.println("hi demo3");
		
		}
	@Test(groups="smoke")
	public void demo4()
	{
		System.out.println("hi demo4");
		
		}
}
