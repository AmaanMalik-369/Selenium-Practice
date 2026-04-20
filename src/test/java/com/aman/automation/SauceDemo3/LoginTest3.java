package com.aman.automation.SauceDemo3;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest3 {

	WebDriver driver;
	LoginPage3 lp;
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		lp = new LoginPage3(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}

		@Test
		void login()
		{
			
			lp.setUserName("Admin");
			lp.setPassword("admin123");
			lp.login();
		}	
		
		
			@AfterTest
			void tearDown()
			{
				driver.quit();
			}  
		}


	

