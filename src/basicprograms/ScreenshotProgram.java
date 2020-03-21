package basicprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotProgram {

	public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.rediff.com");
        driver.manage().window().maximize();
          
	}

}
