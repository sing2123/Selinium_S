package com.Mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test_Runner extends Baseclass1 {
	
 public static void main(String[] args) throws InterruptedException {
	 browserLaunch("chrome");
	 launchUrl("https://www.facebook.com/");
	 
	 WebElement createBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	 
	 clickSingle(createBtn);
	 
	 Thread.sleep(1000);
	 
	 WebElement firstName = driver.findElement(By.name("firstname"));
	 
	 sendKeys(firstName,"Siva");
	 
	 WebElement surName = driver.findElement(By.name("lastname"));
	 
	 sendKeys(surName,"Ranjani");
	 
	 WebElement mobNo = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	 
	 sendKeys(mobNo,"9514996557");
	 
}

	
}

