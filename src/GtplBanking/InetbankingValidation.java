package GtplBanking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InetbankingValidation {
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement userid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement clicklogin;
	
	@FindBy(linkText="New Customer")
	WebElement NewCustomer;
	
	@FindBy(name="name")
	WebElement Customername;
	
	@FindBy(xpath=("//*[text()='female']"))
	WebElement radiobtn;
	
	@FindBy(name="addr")
	WebElement Address;
	
	InetbankingValidation(WebDriver d){
		driver=d;
		PageFactory.initElements(d,this);
	}
	
	public void setuserid(String uname){
		userid.sendKeys(uname);
	}
	public void setpassword(String upass){
		password.sendKeys(upass);
	}
	public void btnlogin(){
		clicklogin.click();
	}
	public void newCustomer(){
		NewCustomer.click();
	}
	public void setcustomername(String cname){
		Customername.sendKeys("cname");
	}
	public void clickradiobtn(){
		radiobtn.click();
		
	}
	public void setAddress(String Addres){
		Address.sendKeys(Addres);
		
	}

}
