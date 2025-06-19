package com.eq.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3Db4free {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.citigroup.com/global/about-us/global-presence/india");

		driver.findElement(By.xpath("//div[text()='My Account']")).click();
		
		driver.findElement(By.xpath("//div[text()='Banking with Citi']")).click();
	}
	
}






