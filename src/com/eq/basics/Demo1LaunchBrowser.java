package com.eq.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		
		String actualUrl= driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		//get the pagesource and print it
		String actualSource=driver.getPageSource();
		System.out.println(actualSource);
	}

}
