package com.Mavenproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass1 {
	public static WebDriver driver;
	private static Actions ac;
	public static WebDriver browserLaunch(String name) {
//BROWSER LAUNCH
		
		if (name.equalsIgnoreCase("chrome")) {System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
		}
		
		else if (name.equalsIgnoreCase("firefox"));{
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	
	return driver;
		
	}
//SENDKEYS
	public static void sendKeys(WebElement webElement,String key) {
		webElement.sendKeys(key);
		
	}

//Click
	
public static void clickSingle(WebElement webElement) {
	webElement.click();
	
}
//get

	       public static void launchUrl(String url) {
	  
		   driver.get(url);
		   
	   }
//close
	       public static void closeBrowser() {
	    	   
	    	   driver.close();
	    	
			
		}
//quit
	       public static void quitBrowser() {
	    	   
	    	   driver.quit();
			
		}
//Navigate to
	       public static void navigateBrowser(String s) {
	    	   
	    	   driver.navigate().to(s);;
			
		}
	    
//Navigate back
	       public static void navigateBrowserBack(String url) {
	    	   
	    	   driver.navigate().back();
			
		}
//Navigate forward
	       public static void navigateBrowserForward(String url) {
	    	   driver.navigate().forward();
			
		}
//Navigate Refresh
	       public static void NavigateBrowserRefresh(String[] url) {
	    	   driver.navigate().refresh();
			
		}
//Alert
	       public static Alert AlertBrowser() {
	    	   Alert S1 = driver.switchTo().alert();
	    	   return S1;
		}
	      

public static void alertOperatingSystems(Alert M1, String s2) {
	if(s2.equalsIgnoreCase("Accept")) {
		M1.accept();
}	       
	else if (s2.equalsIgnoreCase("Dismiss")) {
		M1.dismiss();
	}
}

//alert Operations
public static void alertOperations(Alert M2, String s3) {
	if(s3.equalsIgnoreCase("Accept")) {
		M2.accept();
	
}
	else if (s3.equalsIgnoreCase("Dismiss")) {
		M2.dismiss();
	
	}
}

//frames
public static void frame(WebElement element) {
	driver.switchTo().frame(element);	
}
//FrameIdName

public static void frameIdName(String nameOrId) {
	driver.switchTo().frame(nameOrId);
}
//FrameIndex

public static void frameIndex(int index) {
	driver.switchTo().frame(index);
}

public static void switchDefaultContent() {
	driver.switchTo().defaultContent();
	
}
//parent frame
public static void parentFrame() {
	driver.switchTo().parentFrame();
}

//Window Handling	
public static String main (String getTitleOfwindow){
	String windowHandle = driver.getWindowHandle();
	String title = driver.switchTo().window(windowHandle).getTitle();
	System.out.println(title);
	return title;
}

public static Set<String> getTitlesOfWindowHandles(){
	Set<String> windowHandles = driver.getWindowHandles();
	for (String string : windowHandles) {
		System.out.println(driver.switchTo().window(string).getTitle());
	}
	return windowHandles;
}


public static void switchToWindowByTitle(Set<String> windowHandles, String title) {
	for (String string : windowHandles) {
		if (driver.switchTo().window(string).getTitle().contentEquals(title)) {
			break;
		
	}
	}
}

//robot

public static void robot(String upDownOrEnter) throws AWTException {
	Robot r = new Robot();
	if(upDownOrEnter.equalsIgnoreCase("down")) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	else if (upDownOrEnter.equalsIgnoreCase("enter")) {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	else if(upDownOrEnter.equalsIgnoreCase("up")) {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	

}
//screenshot{

	public static void screenshot(String s) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(s);
		FileUtils.copyFile(src,dest);

	
}

//Radio Button
	public static void radiobutton(WebElement webElement) {
		webElement.click();
	
		
	}
	public static void radioButtonIsEnabled(WebElement webElement) {
		System.out.println(webElement.isEnabled());
		
	}
//ClearText
	public static void clearText(WebElement webElement) {
		webElement.clear();
		
	}
	
//DropDown
	public static void isMultipleDropDown(WebElement webElement) {
		Select s = new Select(webElement);
		System.out.println(s.isMultiple());
		
	}
//is multiple drop down
	public static void selectByValue(WebElement webElement, String value) {
		Select s = new Select(webElement);
		s.selectByValue(value);
		
	}
//Select By visible Text
	public static void selectByVisibleText(WebElement webElement, String visibleText) {
		Select s = new Select(webElement);
		s.selectByVisibleText(visibleText);	
		
	}
	public static void selectByIndex(WebElement webElement, int Index) {
		Select s = new Select(webElement);
		s.selectByIndex(Index);		
	
	
}
	//Get All Selected 
	public static void getAllSelected(WebElement webElement) {
		Select s = new Select(webElement);
		java.util.List<WebElement> allSelectedOptions= s.getAllSelectedOptions();
		
		for (WebElement S2 : allSelectedOptions) {
			System.out.println(S2.getText());
		}
		
		
	}
	//GetFirst Selected

public static void getfirstSelected(WebElement webElement) {
	Select s = new Select(webElement);
	System.out.println(s.getFirstSelectedOption().getText());
}
	public static void getOptions(WebElement webElement) {
		Select s = new Select(webElement);
		System.out.println(s.getOptions());
		
	}
//deSelectAll
public static void deselectByvalue(WebElement webElement, String value) {
	Select s = new Select(webElement);
	s.deselectByValue(value);
	
}
//DeselectByIndex
public static void deselectByIndex(WebElement webElement, int index) {
	Select s = new Select(webElement);
	s.deselectByIndex(index);
	
}
// by visible Text - deselectByVisibleText
public static void deselectByVisibleText(WebElement webElement, String visibleText) {
	Select s = new Select(webElement);
	s.deselectByVisibleText(visibleText);
	
}
//GetText
	public static void getText(WebElement webElement) {
		webElement.getText();
		
	}
//Get Attribute
	public static void getAttributeValue(WebElement webElement, String attributeName) {
		System.out.println(webElement.getAttribute(attributeName));
		
	}
//wait
	public static void wait(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOf(webElement));
	}
//Implicitly Wait
	public static void waitImplicitly() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
//Java Script Executor Scrolling 
	
	public static void scrolling(WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", webElement);		
	}
//Actions
	
	public static void actionsContextClick(WebElement element) {
		ac = new Actions(driver);
		ac.contextClick(element).build().perform();
		
		
	}
	//actions Double Click
	public static void actionsDoubleClick(WebElement element) {
		ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
		
		
	}
//Action Move to Element
	public static void actionsDragDrop(WebElement drag, WebElement drop) {
		ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();
		
		
	}

//CheckBox
	public static void isCheckboxSelected(WebElement webElement) {
		System.out.println(webElement.isSelected());
		
	}

	public static void enableCheckBox(WebElement webElement) {
		webElement.click();

		
	}
//is enabled 
	public static boolean isEnabled(WebElement webElement) {
		System.out.println(webElement.isDisplayed());
		return webElement.isDisplayed();
		
	}
//IS Displayed
	public static boolean isSelected(WebElement webElement) {
		System.out.println(webElement.isSelected());
		return webElement.isSelected();
		
	}
	//Get Current URl
	public static void getCurrentURL() {
		System.out.println(driver.getCurrentUrl());
		
	}
//openURL
	public static void openURL(String s) {
		driver.get(s);
		
	}
		
	}

	









		



   



