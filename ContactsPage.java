package com.praticeprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContactsPage {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("https://www.freecrm.com/index.html");
Thread.sleep(2000);
driver.switchTo().frame("intercom-borderless-frame");
Actions actions = new Actions(driver);
actions.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'intercom-chat-card-author')]")))
		.build().perform();
driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-dismiss-button')]//span")).click();
driver.findElement(By.name("username")).sendKeys("pbharat1992");
driver.findElement(By.name("password")).sendKeys("P@bharat3");
driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
driver.switchTo().frame("mainpanel");
Actions action=new Actions(driver);
action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();




	}

}
