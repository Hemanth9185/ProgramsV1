package basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail {

	 WebDriver driver;
	@FindBy(id="identifierId")
	WebElement Emailid;
	
	@FindBy(xpath=("//*[text()='Next']"))
	WebElement clickNext;
	
	
	@FindBy(xpath=("//input[@name='password']"))
	WebElement Password;
	
	@FindBy(xpath=("//*[text()='Next']"))
	WebElement Next;
	
	Gmail(WebDriver d){
		driver=d;
  PageFactory.initElements(d, this);
	}
	
	public void setEmailid(String uname){
		Emailid.sendKeys(uname);
	}
	public void clickNext() throws InterruptedException{
		clickNext.click();
		Thread.sleep(1000);}
	
	public void setpassword(String pwd){
		Password.sendKeys(pwd);
		
	}
	public void Next(){
		Next.click();
	}
	
	
	
}
