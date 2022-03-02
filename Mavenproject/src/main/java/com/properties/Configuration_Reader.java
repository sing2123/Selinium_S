package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws IOException {
		
	
			File f = new File("C:\\Users\\sivaranjani\\eclipse-workspace\\New\\Mavenproject\\src\\main\\java\\com\\properties\\Configuration.properties");
			FileInputStream fis = new FileInputStream(f);
			p = new Properties();
			p.load(fis);;
	}
		public String geturl() {
			String url = p.getProperty("url");
			return url;
		}
		public String getfirstname() {
			String firstname = p.getProperty("firstname");
			return firstname;
			
		}
		public String getlastname() {
			String  lastname = p.getProperty("lastname");
			return lastname;
		}
		public String getmobno() {
			String  mobno = p.getProperty("mobno");
			return mobno;
		}
}



