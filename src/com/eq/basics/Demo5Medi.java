package com.eq.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5Medi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.medibuddy.in/"); //wait for page load to complete
		 
		//checks for the presence of locator in 0.5s 
		driver.findElement(By.linkText("Login1222")).click();
		
		driver.findElement(By.xpath("//div[text()='I have a Corporate Account']")).click();

	}

}
