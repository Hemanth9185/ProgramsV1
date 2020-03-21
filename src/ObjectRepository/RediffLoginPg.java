package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RediffLoginPg {
	public WebDriver driver;
	@Test
	public void setup(){
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	RedifHomepg rd=new RedifHomepg(driver);
		rd.reglink();
		rd.Setfirstname("Saketi");
		rd.setlastname("Hemanth kumar");
	    rd.setphone("9121354487");
	}

	
	
}
