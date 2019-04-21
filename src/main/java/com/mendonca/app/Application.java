package com.mendonca.app;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramasGM\\chromeDriver\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		JavascriptExecutor js;
		
		driver.get("https://www.primefaces.org/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if (driver instanceof JavascriptExecutor) {
		  js =  (JavascriptExecutor)driver;
		} else {
		    throw new IllegalStateException("This driver does not support JavaScript!");
		}
		
		
		List<WebElement> elements  =	 (List<WebElement>) js.executeScript(" return document.getElementsByClassName('mkdf-btn-text')");
		elements.get(4).click();
		
		//js.executeScript("elem = document.getElementsByClassName('mkdf-btn-text')");
		//js.executeScript("elem[4].click()");
		//elem = document.getElementsByClassName("mkdf-btn-text")
		// elem[4].click()
		
		

	}

}
