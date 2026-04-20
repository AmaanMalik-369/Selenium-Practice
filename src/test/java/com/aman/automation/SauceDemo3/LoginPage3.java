package com.aman.automation.SauceDemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage3 {
		
			WebDriver driver;
			//Constructor
		public	LoginPage3 (WebDriver driver) 
			{
		        this.driver= driver;
		    }
			
	

		//Locators
		By txt_username_loc = By.xpath("//input[@name='username']");  
		By txt_password_loc = By.xpath("//input[@name='password']");
		By btn_submit_loc = By.xpath("//*[@type='submit']");

		//action methods
		public void setUserName(String user)
		{
		     driver.findElement(txt_username_loc).sendKeys(user);
		}

		public void setPassword(String password)
		{
			driver.findElement(txt_password_loc).sendKeys(password);
		}
		public void login()
		{
			driver.findElement(btn_submit_loc).click();
		}
		}

