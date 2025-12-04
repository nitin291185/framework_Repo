package pack_1;

import org.testng.annotations.Test;

public class contactTest {
	
	@Test
	
	public void createContactTest() {
		String URL=System.getProperty("browser","chrome");
		String BROWSER = System.getProperty("username");
		String USERNAME= System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Execute Create contact test");
	}
@Test
public void modifyContactTest() {
	System.out.println("Modify contact test");
	
	
}

@Test
public void deleteContactTest() {
System.out.println("delete contact test");


}





}