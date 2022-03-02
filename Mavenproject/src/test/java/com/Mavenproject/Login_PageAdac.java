package com.Mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PageAdac {
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement room;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomnumbers;
	
	@FindBy(xpath = "//input[@maxlength='10'])[1]")
	private WebElement checkindate;
	
	@FindBy(xpath = "//select[@maxlength='10'][1]")
	private WebElement checkoutdate;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement adultsperroom;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childperroom;
	
	@FindBy(id = "submit")
	private WebElement search;

	public Login_PageAdac(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void Login_PageAdac(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getRoom() {
		return room;
	}


	public WebElement getRoomnumbers() {
		return roomnumbers;
	}


	public WebElement getCheckindate() {
		return checkindate;
	}


	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}


	public WebElement getChildperroom() {
		return childperroom;
	}


	public WebElement getSearch() {
		return search;
	}
}


	
	


