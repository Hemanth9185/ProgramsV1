package basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmailvalidation {
	@Test
	public void Gmailval() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Gmail lg=new Gmail(driver);
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		lg.setEmailid("hemanthmech229");
		lg.clickNext();
		lg.setpassword("9121354487");
		lg.Next();
	}
	
	
	
	
	

}
