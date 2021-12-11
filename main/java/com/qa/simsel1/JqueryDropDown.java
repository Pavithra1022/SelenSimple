package com.qa.simsel1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDown {
	public static void main(String args[])
	{
		JqueryDropDown jdd=new JqueryDropDown();
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		 
		 WebElement ele = driver.findElement(By.id("justAnInputBox"));
		 WebElement ele1 = driver.findElement(By.className("comboTreeArrowBtnImg"));
		 ele1.click();
		 List<WebElement> inputs = driver.findElements(By.xpath("//*[@class='comboTreeDropDownContainer']/ul/li"));////div[@id='comboTree351334DropDownContainer']//li[text()]
		 
		 jdd.Toprintselectoptions(inputs);	
		
	     jdd.ToSelectOtion(inputs, "choice_3");
	}
	public void Toprintselectoptions(List<WebElement> locat)
	{
		List<WebElement> locate=  locat;
		
		Iterator<WebElement> it = locate.iterator();
		while(it.hasNext())
		{
			WebElement ele2 = it.next();
			String option =ele2.getText();
			System.out.println(ele2.getText());
			
		}
	}
	
	public void ToSelectOtion(List<WebElement> webele,String value)
	{
		Iterator<WebElement> it1 = webele.iterator();
		while(it1.hasNext())
		{
			WebElement ele2 = it1.next();
			String option =ele2.getText();
			if(option.equals(value.replaceAll("_", " ")))
			{
			ele2.click();
			}
			
		}
	}
}
	
	



