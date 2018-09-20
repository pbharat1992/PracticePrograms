package com.praticeprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootStrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-info btn-sm dropdown-toggle')]")).click();
        List <WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//li//label"));
      
               System.out.println(list.size());
     //for selecting all the checkboxes
//      for(int i=0;i<list.size();i++)
//      {
//         list.get(i).click();
//    	  System.out.println(list.get(i).getText());
//    	  
//    	}
      
    
//      
//               boolean b=driver.findElement(By.xpath("//input[@type='checkbox' and @value='jQuery']")).isSelected();
//               System.out.println(b);
      
   //  driver.findElement(By.xpath("//button[@type='button' and  @class='btn btn-xs btn-success save' and @value='Save']")).click();
     
      
       //for selecting single checkbox
     for(int i=0;i<list.size();i++) {
    	 System.out.println(list.get(i).getText());
    	 if(list.get(i).getText().contains("Bootstrap")) {
    		 list.get(i).click();
    		
             break;
             
    	 }   
     }
     
     driver.findElement(By.xpath("//button[@type='button' and  @class='btn btn-xs btn-success save' and @value='Save']")).click();
    	 boolean b=driver.findElement(By.xpath("//input[@type='checkbox' and @value='Bootstrap']")).isSelected();
         System.out.println(b);
         
    	  
        
	


}}