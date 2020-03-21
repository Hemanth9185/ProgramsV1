package basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orangeHrmValidation {
@Test
public void Flightvalidation(){
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		OrangeHrm or=new OrangeHrm(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        or.setUsername("Admin");
        or.setUserPassWord("admin123");
        
      
}
	}


