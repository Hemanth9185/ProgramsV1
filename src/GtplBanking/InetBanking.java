package GtplBanking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InetBanking {
	@Test
	public void inetvalidation(){
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		InetbankingValidation vl=new InetbankingValidation(driver);
	    driver.get("http://demo.guru99.com/V1/index.php");
	    driver.manage().window().maximize();
	    vl.setuserid("mngr244105");
	    vl.setpassword("rYbynur");
	    vl.btnlogin();
	    vl.newCustomer();
	    vl.setcustomername("Hema");
	    vl.clickradiobtn();
	    vl.setAddress("Flat.No.408-PVN-Colony-DreamEnClave,YadavNagar");
	}

}
