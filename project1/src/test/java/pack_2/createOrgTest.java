package pack_2;

import org.testng.annotations.Test;

public class createOrgTest {

	@Test
	
	public void createOrggTest() {
		System.out.println("Create org test");
		String URL=System.getProperty("browser","chrome");
		String BROWSER = System.getProperty("username");
		String USERNAME= System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	
	
	@Test
	public void modifyOrgTest() {
		String URL=System.getProperty("browser","chrome");
		String BROWSER = System.getProperty("username");
		String USERNAME= System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Modify Org test");
	
	
	
	}

	@Test
	public void deleteOrgTest() {
		String URL=System.getProperty("browser","chrome");
		String BROWSER = System.getProperty("username");
		String USERNAME= System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("delete Org test");
	}
}
