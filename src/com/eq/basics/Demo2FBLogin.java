package com.eq.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		
		By locator= By.id("email");
		WebElement element= driver.findElement(locator);
		element.sendKeys("jack23232323232@gmail.com");

//		WebElement element= driver.findElement(By.id("email"));
//		element.sendKeys("jack23232323232@gmail.com");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("jack23232323232@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("welcome12343");
		driver.findElement(By.cssSelector("[name='login']")).click();
	}

}
