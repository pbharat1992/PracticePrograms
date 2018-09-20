package com.praticeprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipKartProductDetails {
public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	
         System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	
	
		//for flipkart:
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(@class,'_2AkmmA _29YdH8')]")).click();
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]")))
        .build().perform();
		try {
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[contains(text(),'Irons')]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//using select class  for dropdown for printing highest and lowest pricesor names of the products
		Select select = new Select(driver.findElement(By.xpath("//select[@class='fPjUPw']")));
		select.selectByValue("2000");
		Thread.sleep(3000); 
		List<WebElement> products=driver.findElements(By.xpath("//div[contains(@class,'_3liAhj _1R0K0g')]"));
		System.out.println("Total products:--"+products.size());
	    //int productLen=products.size();
		WebElement lastproduct=products.get(products.size()-1);
		Actions actions1=new Actions(driver);
	    actions1.moveToElement(lastproduct).build().perform();
		//System.out.println(lastproduct.getText());
	    System.out.println("===============================================================================================");
		for(int i=0;i<=products.size()-1;i++) {
		System.out.println("The names and prices of products are :---"+products.get(i).getText());
		System.out.println("===============================================================================================");
		}
	    }
		
 	

		 
			
		 
		     
	
         
         

	     //for snapdeal: This code is because of products are more while scrolling down  the page
		
		
//	   driver.get("https://www.snapdeal.com/");
//	  Thread.sleep(3000);
//	     		Actions actions=new Actions(driver);
//		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Mobile & Tablets')]")))
//          .build().perform();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Smartphones')]")).click();
//
//		
//	
//		List<WebElement> products=driver.findElements(By.xpath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple ']"));
//		int productLen=products.size();
//		System.out.println("Total  products and length is:-- "+productLen);
//	     
//	     Actions actions1=new Actions(driver);
//	     int oldproductsLen=0;
//      while(productLen!=oldproductsLen) {	
//	   oldproductsLen=productLen;
//	     WebElement lastproduct=products.get(productLen-1);
//	     actions1.moveToElement(lastproduct).build().perform();
//	     Thread.sleep(5000);
//	     products=driver.findElements(By.xpath("//div[@class='col-xs-6 last-no-border  favDp product-tuple-listing js-tuple']"));
//	     productLen=products.size();
//	     System.out.println("Total products :--"+productLen);
//	
//	}
//      System.out.println(" Final Total products :--"+productLen);
//      System.out.println("=====================================================================================");
//      for(int i=0;i<=productLen;i++) {
//    	  System.out.println("The names and prices of products are :---"+products.get(i).getText());
//    	  System.out.println("=====================================================================================");
//      }
  	
      
      
      

	


}