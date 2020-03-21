package testcase;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class orangeValidationHrm {
	public WebDriver driver;
	@FindBy(linkText="REGISTER")
	WebElement Reglink;
	
	@FindBy(name="firstName")
	WebElement Firstname;
	
	@FindBy(name="lastName")
	WebElement Lastname;
	
	@FindBy(name="phone")
	WebElement Phone;
	
	orangeValidationHrm(WebDriver d){
		driver=d;
	PageFactory.initElements(d, this);
		
	}

	public void Reglink(){
		Reglink.click();
	}
	public void setfirstname(String fname){
		Firstname.sendKeys(fname);
		
	}
    public void setlastname(String lname){
    	Lastname.sendKeys(lname);
    }
	public void setphone(String pnum){
		Phone.sendKeys(pnum);
	}
    
    
    
    
}
