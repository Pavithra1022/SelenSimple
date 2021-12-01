package com.qa.simsel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorsconcet {;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		By username = By.id("txtUsername");
		WebElement ele1 = driver.findElement(username);
		ele1.sendKeys("Admin");
		
		By password = By.id("txtPassword");
		WebElement ele2 = driver.findElement(password);
		ele2.sendKeys("admin123");
		
		By loginbtn = By.id("btnLogin");
		WebElement btn = driver.findElement(loginbtn);
		btn.click();
		
		By text = By.id("welcome");
		WebElement ele3 = driver.findElement(text);
		System.out.println(ele3.getText());

	}

}
