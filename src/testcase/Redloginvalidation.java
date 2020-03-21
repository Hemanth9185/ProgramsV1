package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Redloginvalidation {

public WebDriver driver;
@BeforeTest
public void setup(){
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://newtours.demoaut.com/");		
}
@Test(priority=1)
public void Reglink(){
driver.findElement(By.linkText("REGISTER")).click();
Reporter.log("Clicked on Register Button", true);
}
@Test(priority=2)
public void flightReg(){
driver.findElement(By.name("firstName")).sendKeys("Hemanth");
driver.findElement(By.name("lastName")).sendKeys("Kumar");
driver.findElement(By.name("phone")).sendKeys("9121354487");
driver.findElement(By.id("userName")).sendKeys("hemanthmech229@gmail.com");
driver.findElement(By.name("address1")).sendKeys("9-146/4");
driver.findElement(By.name("address2")).sendKeys("pvncolony");
driver.findElement(By.name("city")).sendKeys("Hyderabad");
driver.findElement(By.name("state")).sendKeys("Telanagana");
driver.findElement(By.name("postalCode")).sendKeys("500047");
Select countrylist=new Select(driver.findElement(By.name("country")));
countrylist.selectByValue("8");
driver.findElement(By.name("email")).sendKeys("hemanth999");
driver.findElement(By.name("password")).sendKeys("9505136731");
driver.findElement(By.name("confirmPassword")).sendKeys("9505136731");
}	


}
