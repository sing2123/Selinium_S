package com.Mavenproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniproject_HotelBooking {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("sivaranjanik");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("singee@karthi");
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();

		WebElement location = driver.findElement(By.name("location"));
		Select s1 = new Select(location);
		s1.selectByValue("Sydney");
		WebElement hotels = driver.findElement(By.name("hotels"));
		Select s2 = new Select(hotels);
		s2.selectByValue("Hotel Sunshine");
		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s3 = new Select(roomtype);
		s3.selectByValue("Double");
		WebElement roomnumbers = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s4 = new Select(roomnumbers);
		s4.selectByValue("2 - Two");
		WebElement datein = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		datein.sendKeys("23/06/2022");
		WebElement dateout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		dateout.sendKeys("26/02/2022");
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s5 = new Select(adult);
		s5.selectByValue("2");
		WebElement children = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s6 = new Select(children);
		s6.selectByValue("2");
		WebElement searchbutton = driver.findElement(By.name("Submit"));
		searchbutton.click();
	
		WebElement selectcontinue = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		selectcontinue.click();
		WebElement continuesubmit = driver.findElement(By.xpath("//input[@name='continue']"));
		continuesubmit.click();
	
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("sivaranjani");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("sing");
		WebElement billingaddress = driver.findElement(By.name("address"));
		billingaddress.sendKeys("CDM Compound, Karaikudi");
		WebElement ccnumber = driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccnumber.sendKeys("9944569680");
		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s7 = new Select(cctype);
		s7.selectByValue("siva");
		WebElement ccexpmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s8 = new Select(ccexpmonth);
		s8.selectByValue("8");
		WebElement ccexpyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s9 = new Select(ccexpyear);
		s9.selectByValue("2022");
		WebElement cccvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cccvv.sendKeys("389");
		WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
		booknow.click();

		WebElement myitinerary = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		myitinerary.click();
		//Booked Itinerary Page - Take Screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\sivaranjani\\eclipse-workspace\\New\\Java\\Screenshots");

		FileUtils.copyFile(src, dest);
		WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
		logout.click();
		

	}


		
	}


