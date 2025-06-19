package com.eq.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Db4free {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.db4free.net/");

		//click on phpMyAdmin »
		//b[contains(text(),'phpMyAdmi')]
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		
	
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(windows);
		System.out.println(windows.get(0));
		System.out.println(windows.get(1));
		
	}

}






