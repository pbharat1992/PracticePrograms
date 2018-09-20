package com.praticeprograms;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdUploadWeb {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://millionads.org/dc/agentpost.php");
		
			Thread.sleep(5000L);
			
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("1test1@gmail3.com");
			driver.findElement(By.xpath("//*[@id='website']")).sendKeys("http://www.google.com");
			driver.findElement(By.xpath("//*[@id='cat']")).sendKeys("Books & Publications");
			driver.findElement(By.xpath("//*[@id='title']")).sendKeys("Title for Books and publications");
			driver.findElement(By.xpath("//*[@id='description']")).sendKeys("Our products include furniture inspired by the Classics, including designers like Florence Knoll, Eero Saarinen, Arne Jacobsen, Charles Eames, Mies van der Rohe & many more. The product we offer is not competing with the lower priced imitations, we believe that our furniture should be suitable for use and last for");
			driver.findElement(By.xpath("//*[@id='affcode']")).sendKeys("1test1@gmail3.co");
			
			driver.findElement(By.xpath("html/body/div[2]/div/div[2]/span[2]/table/tbody/tr[9]/td[2]/input")).click();
			
		
			//driver.quit();
			
			
			 driver = new ChromeDriver();
			driver.get("http://millionads.org/dc/agentpost.php");
			
				Thread.sleep(5000L);
				
				driver.findElement(By.xpath("//*[@id='email']")).sendKeys("1test2@gmail4.com");
				driver.findElement(By.xpath("//*[@id='website']")).sendKeys("http://www.google.com");
				driver.findElement(By.xpath("//*[@id='cat']")).sendKeys("Books & Publications");
				driver.findElement(By.xpath("//*[@id='title']")).sendKeys("Title for Books and publications");
				driver.findElement(By.xpath("//*[@id='description']")).sendKeys("Our products include furniture inspired by the Classics, including designers like Florence Knoll, Eero Saarinen, Arne Jacobsen, Charles Eames, Mies van der Rohe & many more. The product we offer is not competing with the lower priced imitations, we believe that our furniture should be suitable for use and last for");
				driver.findElement(By.xpath("//*[@id='affcode']")).sendKeys("1test2@gmail4.co");
				
				driver.findElement(By.xpath("html/body/div[2]/div/div[2]/span[2]/table/tbody/tr[9]/td[2]/input")).click();
		
		
				driver.quit();
		
	}

}
