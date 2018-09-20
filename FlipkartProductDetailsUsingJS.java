package com.praticeprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartProductDetailsUsingJS {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//for flipkart:
//		driver.get("https://www.flipkart.com/");
//		
//		Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
//		
//		Actions actions=new Actions(driver);
//		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]")))
//.build().perform();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[contains(text(),'Irons')]")).click();
//		List<WebElement> products=driver.findElements(By.xpath("//div[@class='_3liAhj _1R0K0g']//a"));
//		int productLen=products.size();
//		System.out.println("list of products and length"+productLen);
//	
//		WebElement lastproduct=products.get(productLen-1);
//	     Actions actions1=new Actions(driver);
//	     actions1.moveToElement(lastproduct).build().perform();
//	     //System.out.println(lastproduct.getText());
//	     for(int i=0;i<=productLen;i++) {
//	    	  System.out.println("The names and prices of products are :---"+products.get(i).getText());
//	      }

	     

	     //for snapdeal: This code is because of products are more while scrolling down  the page

   driver.get("https://www.snapdeal.com/");
	   Thread.sleep(2000);
	     		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Mobile & Tablets')]")))
          .build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Smartphones')]")).click();

		
	
		List<WebElement> products=driver.findElements(By.xpath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple ']"));
		int productLen=products.size();
		System.out.println("Total  products and length is:-- "+productLen);
		
 
	     int oldproductsLen=0;
      while(productLen!=oldproductsLen) {	
	   oldproductsLen=productLen;
	     WebElement lastproduct=products.get(productLen-1);
	     int y=lastproduct.getLocation().getY();
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("window.scrollTo(0,"+y+")");
	     
	     Thread.sleep(2000);
	     products=driver.findElements(By.xpath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple ']"));
	     productLen=products.size();
	     System.out.println("Total products :--"+productLen);
	
	}
      
     System.out.println(" Final Total products :--"+productLen);
     System.out.println("===============================================================================================");
      for(int i=0;i<=productLen;i++) {
    	  System.out.println("The names and prices of products are :---"+products.get(i).getText());
    	  System.out.println("===============================================================================================");
      }
  
      
      
      
	}




	}


