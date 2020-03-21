package basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrm {
	 WebDriver driver;
	
	
	@FindBy(id="txtUsername")
	WebElement Username;
	
	@FindBy(id="txtPassword")
	WebElement UserpassWord;
	
	OrangeHrm (WebDriver d){
	driver=d;
	PageFactory.initElements(d,this);}
	
	
public void setUsername(String uname){
		Username.sendKeys(uname);
		
	}
public void setUserPassWord(String upass){
	UserpassWord.sendKeys(upass);
	
}

}
