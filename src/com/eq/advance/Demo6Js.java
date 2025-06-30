package com.eq.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Demo6Js {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.malaysiaairlines.com/us/en/home.html");

		//approach 1 
		//driver.findElement(By.cssSelector("")).sendKeys("20 Jul 2025");
		
		
		//approach 2 - automate calendar 
		
		
		//approach 3 - js
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"input[name='dateDeparture']\").value='20 Jul 2025'");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("error.png"));
	}

}


