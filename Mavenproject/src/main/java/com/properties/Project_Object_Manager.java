package com.properties;

	import org.openqa.selenium.WebDriver;

	import com.pomclass.Account_Creation;
	import com.pomclass.Login_Page;

	public class Project_Object_Manager {
		public WebDriver driver;
		private Login_Page lp;
		private Object ac; 
		public Project_Object_Manager(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		}
		
		
		public Login_Page getLp() {
			return lp;
		}
		public Login_Page getInstancelp() {
			if (lp==null)	{
				lp = new Login_Page(driver);
			}
			return lp;
		
		}
		public Object getInstanceAc() { 
		if (ac==null) {
			ac = new Account_Creation(driver);
		}
		return ac;
			
		}
			
		}





