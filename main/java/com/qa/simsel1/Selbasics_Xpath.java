package com.qa.simsel1;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selbasics_Xpath {

	WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		List<WebElement> element = driver.findElements(By.xpath("//*[@id='pageFooterChildren']/ul/li"));
		WebElement ele1 = driver.findElement(By.xpath("//*[@role='menuitem']"));

		String s1 = ele1.getAttribute("aria-haspopup");
		System.out.println(s1 + "======================");

		/*
		 * ListIterator<WebElement> li = element.listIterator(); while (li.hasNext()) {
		 * System.out.print(li.next().getText()); }
		 * 
		 * element.forEach(e -> System.out.println(e)); int w = 0; while (w <
		 * element.size()) { System.out.println(element.get(w).getText()); }
		 * 
		 * System.out.println("==========Iterator===========");
		 * 
		 * Iterator it = element.iterator(); { while (it.hasNext()) {
		 * System.out.println(it.next()); } }
		 * 
		 * for (int i = 0; i < element.size(); i++) {
		 * 
		 * System.out.print(element.get(i).getText()); System.out.println(" "); }
		 */

		driver.navigate().to("https://www.amazon.in/");
		WebElement ele2 = driver.findElement(By.linkText("Start here."));
		System.out.println(ele2.getAttribute("href"));
		Selbasics_Xpath s= new Selbasics_Xpath();
		
		driver.get("https://www.amazon.in/");
		WebElement amazonsearchbox =driver.findElement(By.id("twotabsearchtextbox")); //twotabsearchtextbox
		amazonsearchbox.sendKeys("mobile");
		String value = amazonsearchbox.getAttribute("value");
		System.out.println("Entered value is "+value);
	}

}
