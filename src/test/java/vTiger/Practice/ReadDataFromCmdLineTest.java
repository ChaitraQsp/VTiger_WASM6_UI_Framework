package vTiger.Practice;

import org.testng.annotations.Test;

public class ReadDataFromCmdLineTest {
	
	@Test
	public void readData()
	{
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("pass");
		
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

}
