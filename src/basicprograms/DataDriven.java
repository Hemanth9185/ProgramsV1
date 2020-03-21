package basicprograms;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDriven {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:/Users/HP/Desktop/Registration Data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
	    int Rowcount=sheet.getLastRowNum();
	    for(int i=1;i<Rowcount;i++){
	    XSSFRow row=sheet.getRow(i);
	      XSSFCell firstname=row.getCell(0);    
	   String fname= firstname.getStringCellValue();
	   
	   XSSFCell Lastname=row.getCell(1);
	    String lname=Lastname.getStringCellValue();
	   
	   System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://newtours.demoaut.com");
	   driver.manage().window().maximize();
	   driver.findElement(By.linkText("REGISTER")).click();
	   driver.findElement(By.name("firstName")).sendKeys(fname);
	   driver.findElement(By.name("lastName")).sendKeys(lname);
	   
	   
	   
	   
	   
	   
	   
	    }


	    }
		       }
	

		
	    
	 
	  
