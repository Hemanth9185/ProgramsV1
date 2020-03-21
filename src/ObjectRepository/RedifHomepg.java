package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedifHomepg {
	
	 public WebDriver driver;
	
    @FindBy(linkText="REGISTER")	
	WebElement Reglink;
    
    @FindBy(name="firstName")
    WebElement firstname;
    
    @FindBy(name="lastName")
    WebElement lastname;
    
    @FindBy(name="phone")
    WebElement phone;
    
    RedifHomepg(WebDriver d){
    	driver=d;
    PageFactory.initElements(d,this);
   }
    
    public void reglink(){
    	Reglink.click();
    	
    }
    public void Setfirstname(String fname){
    	
    	firstname.sendKeys(fname);
    	
    }
    public void setlastname(String lname){
    	lastname.sendKeys(lname);
    	
    }
    public void setphone(String pnum){
    	phone.sendKeys(pnum);
    	
    }
    
    


	    }


