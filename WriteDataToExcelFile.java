package com.praticeprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testdata.Xls_Reader;

public class WriteDataToExcelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method s tub

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		
		String beforeXpath_company="//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath_company="]/td[1]";
		
		String beforeXpath_contact="//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath_contact="]/td[2]";
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println("Total no of rows:---"+rows.size());
		int rowCount=rows.size();
		
		Xls_Reader reader=new Xls_Reader("D:\\eclipse oxyzen\\eclipse\\CHARI"
				+ "\\AllPracticePrograms\\src\\main\\java\\com\\testdata\\Mahesh.xlsx");
		if(!reader.isSheetExist("Bharat")) {
		reader.addSheet("Bharat");
		reader.addColumn("harsha","CompanyName");
		reader.addColumn("harsha","ContactName");
		}
		
		
		
		for(int i=2;i<=rowCount;i++)
		{
			String actualXpath_company=beforeXpath_company+i+afterXpath_company;
			String companyName=driver.findElement(By.xpath(actualXpath_company)).getText();
			System.out.println(companyName);
			reader.setCellData("harsha","CompanyName",i,companyName);
		
			
			String actualXpath_contact=beforeXpath_contact+i+afterXpath_contact;
			String contactName=driver.findElement(By.xpath(actualXpath_contact)).getText();
			System.out.println(contactName);
			reader.setCellData("harsha","ContactName",i,contactName);
			
			
		}
	}

}