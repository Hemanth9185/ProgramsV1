package basicprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenReadCellData {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window();
		driver.findElement(By.linkText("REGISTER"));
	
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\Registration Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet  sheet =  workbook.getSheet("Sheet1");
		int Rowcount=sheet.getLastRowNum();
		for(int i=1;i<Rowcount;i++){
		XSSFRow row=sheet.getRow(i);
		
		   XSSFCell FirstName=row.getCell(0);
		  String fname =FirstName.getStringCellValue();
		  
		 XSSFCell LastName=row.getCell(1);
         String Lname=LastName.getStringCellValue();
         
          XSSFCell phone =row.getCell(2);
          int phn=(int)phone.getNumericCellValue();
          
          
          
          
          
          
          
          
			
			
		}

		 
		  
		  
		  
		 }
		
			  
			 
			 }
		
			 
		 }
