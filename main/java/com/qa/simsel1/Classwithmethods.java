package com.qa.simsel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classwithmethods {
	WebDriver driver;
	
	public void startbrowser(String url,String browsername)
	{
		String browser = browsername;
		switch(browsername.toLowerCase())
		{
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			
			case "ie":
				WebDriverManager.firefoxdriver().setup();
				driver = new InternetExplorerDriver();
			    break;
			    
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
				default:
					System.out.println("lease enter correct browser");
				    driver.get(url);
		}
			
	}
	public void navigatebrowser()
	{
	driver.navigate().to("https://www.flipkart.com/");	
	}
	public void quit()
	{
		driver.quit();
	}
	public void close()
	{
		driver.close();
	}
	public void launchbrowser()
	{
		String browser = "chrome";
		String url ="https://www.google.com";
		startbrowser(url,browser);
		
	}

}
